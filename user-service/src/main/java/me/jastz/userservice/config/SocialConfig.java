package me.jastz.userservice.config;

import me.jastz.userservice.user.AccountConnectionSignUp;
import me.jastz.userservice.user.SimpleSignInAdapter;
import me.jastz.userservice.user.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.social.UserIdSource;
import org.springframework.social.config.annotation.ConnectionFactoryConfigurer;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.config.annotation.SocialConfigurer;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.connect.jdbc.JdbcUsersConnectionRepository;
import org.springframework.social.connect.web.ProviderSignInController;
import org.springframework.social.connect.web.SessionUserIdSource;
import org.springframework.social.weibo.connect.WeiboConnectionFactory;

import javax.sql.DataSource;

/**
 * Created by zhiwen on 2017/8/25.
 */
@Configuration
@EnableSocial
public class SocialConfig implements SocialConfigurer {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private AccountDAO accountDAO;

    @Override
    public void addConnectionFactories(ConnectionFactoryConfigurer connectionFactoryConfigurer, Environment environment) {
        connectionFactoryConfigurer.addConnectionFactory(
                new WeiboConnectionFactory(environment.getProperty("weibo.clientId")
                        , environment.getProperty("weibo.clientSecret")));
    }

    @Override
    public UserIdSource getUserIdSource() {
        return new SessionUserIdSource();
    }

    @Override
    public UsersConnectionRepository getUsersConnectionRepository(ConnectionFactoryLocator connectionFactoryLocator) {
        JdbcUsersConnectionRepository repository = new JdbcUsersConnectionRepository(dataSource
                , connectionFactoryLocator, Encryptors.noOpText());
        repository.setConnectionSignUp(new AccountConnectionSignUp(accountDAO));
        return repository;
    }

    @Bean
    public ProviderSignInController providerSignInController(ConnectionFactoryLocator connectionFactoryLocator
            , UsersConnectionRepository usersConnectionRepository) {
        return new ProviderSignInController(connectionFactoryLocator, usersConnectionRepository
                , new SimpleSignInAdapter());
    }
}
