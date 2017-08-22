package me.jastz.helloservicerefactor.controller;

import me.jastz.helloserviceapi.service.IHelloService;
import me.jastz.helloserviceapi.vo.User;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhiwen on 2017/8/22.
 */
@RestController
public class HelloController implements IHelloService {
    @Override
    public String hello() {
        return "hello";
    }

    @Override
    public User hello(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        return new User(name, age);
    }
}
