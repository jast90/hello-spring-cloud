package me.jastz.hellofeignconsumerrefactor.service;

import me.jastz.helloserviceapi.vo.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zhiwen on 2017/8/22.
 */
@Component
public class HelloServiceFallback implements HelloService {
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public User hello(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        return new User("未知", 0);
    }
}
