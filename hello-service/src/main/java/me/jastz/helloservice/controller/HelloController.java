package me.jastz.helloservice.controller;

import me.jastz.helloservice.vo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhiwen on 2017/8/21.
 */
@RestController
public class HelloController {

    @GetMapping(value = "hello")
    public String hello() {
        return "hello";
    }

    @GetMapping(value = "hello1")
    public User hello(@RequestParam(name = "name") String name
            , @RequestParam(name = "age") Integer age) {
        return new User(name, age);
    }
}
