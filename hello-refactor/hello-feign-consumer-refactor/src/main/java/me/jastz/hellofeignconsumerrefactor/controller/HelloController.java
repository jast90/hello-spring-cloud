package me.jastz.hellofeignconsumerrefactor.controller;

import me.jastz.hellofeignconsumerrefactor.service.HelloService;
import me.jastz.helloserviceapi.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhiwen on 2017/8/22.
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("hello")
    public String hello() {
        return helloService.hello();
    }

    @GetMapping("hello1")
    public User hello1(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        return helloService.hello(name, age);
    }
}
