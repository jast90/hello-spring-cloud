package me.jastz.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhiwen on 2017/8/24.
 */
@RestController
public class HelloController {

    @Value("${suffix:default}")
    private String suffix;

    @GetMapping("hello")
    public String hello() {
        return suffix;
    }
}
