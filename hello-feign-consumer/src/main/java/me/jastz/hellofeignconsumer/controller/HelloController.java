package me.jastz.hellofeignconsumer.controller;

import me.jastz.hellofeignconsumer.service.HelloService;
import me.jastz.hellofeignconsumer.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhiwen on 2017/8/21.
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("hello")
    public String hello() {
        return helloService.hello();
    }

    @GetMapping("hello1")
    public User hello1(@RequestParam(name = "name") String name
            , @RequestParam(name = "age") Integer age) {
        return helloService.hello(name, age);
    }
}
