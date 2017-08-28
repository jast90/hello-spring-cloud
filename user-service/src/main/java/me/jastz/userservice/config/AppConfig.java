package me.jastz.userservice.config;

import me.jastz.userservice.user.currentAccount.CurrentAccount;
import me.jastz.userservice.user.currentAccount.SessionCurrentAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhiwen on 2017/8/28.
 */
@Configuration
public class AppConfig {
    
    @Bean
    public CurrentAccount CurrentAccount() {
        return new SessionCurrentAccount();
    }
}
