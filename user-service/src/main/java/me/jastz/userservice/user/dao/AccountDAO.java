package me.jastz.userservice.user.dao;

import me.jastz.userservice.user.entity.Account;
import org.springframework.stereotype.Repository;

/**
 * Created by zhiwen on 2017/8/25.
 */
@Repository
public interface AccountDAO {

    void save(Account account);

}
