package me.jastz.userservice.user;

import me.jastz.userservice.user.dao.AccountDAO;
import me.jastz.userservice.user.entity.Account;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.social.connect.UserProfile;

/**
 * Created by zhiwen on 2017/8/25.
 */
public class AccountConnectionSignUp implements ConnectionSignUp {

    private AccountDAO accountDAO;

    public AccountConnectionSignUp(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public String execute(Connection<?> connection) {
        UserProfile userProfile = connection.fetchUserProfile();
        Account account = new Account(userProfile.getUsername(), userProfile.getFirstName(), userProfile.getLastName());
        accountDAO.save(account);
        if (account.getAccountId() != null) {
            return account.getAccountId().toString();
        }
        return null;//返回null代表用户名注册失败
    }
}
