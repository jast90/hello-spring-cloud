package me.jastz.configclienteureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhiwen on 2017/8/24.
 */
@RestController
public class HelloController {
    @Value("${app.name:default}")
    private String name;

    @GetMapping("hello")
    public String hello() {
        return name;
    }
}
