package me.jastz.userservice.user.controller;

import me.jastz.userservice.user.currentAccount.CurrentAccount;
import me.jastz.userservice.user.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * Created by zhiwen on 2017/8/28.
 */
@Controller
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountDAO accountDAO;

    @Autowired
    private CurrentAccount currentUser;

    @Autowired
    private HttpSession httpSession;

    @GetMapping("viewComplete")
    public String viewComplete() {
        return "account/viewComplete";
    }

    @PostMapping("complete")
    public ResponseEntity<String> complete(@RequestParam String phoneNumber, @RequestParam(defaultValue = "") String password
            , @RequestParam(defaultValue = "") String twicePassword) {
        ResponseEntity<String> responseEntity;
        if (!password.equals(twicePassword)) {
            responseEntity = new ResponseEntity("密码不一致", HttpStatus.OK);
            return responseEntity;
        }
        if (accountDAO.isPhoneNumberExist(phoneNumber)) {
            responseEntity = new ResponseEntity("手机号已存在", HttpStatus.OK);
            return responseEntity;
        }
        if (currentUser == null) {
            throw new RuntimeException("请实现获取当前用户策略");
        }
        Long accountId = currentUser.getAccountId();
        if (accountDAO.updateComplete(accountId, true) > 0) {
            responseEntity = new ResponseEntity("注册完成", HttpStatus.OK);
        } else {
            responseEntity = new ResponseEntity("注册失败", HttpStatus.OK);
        }
        return responseEntity;
    }
}
