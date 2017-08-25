package me.jastz.userservice.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhiwen on 2017/8/25.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
