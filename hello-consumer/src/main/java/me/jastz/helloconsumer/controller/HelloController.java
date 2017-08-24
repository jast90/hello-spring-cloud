package me.jastz.helloconsumer.controller;

import me.jastz.helloconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhiwen on 2017/8/21.
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @Autowired
    private Environment environment;

    @Value("${suffix:default}")
    private String suffix;

    @RequestMapping("hello")
    public String hello() {
        return helloService.hello() + " " + suffix + " " + environment.getProperty("suffix");
    }

}
