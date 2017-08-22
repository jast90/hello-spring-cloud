package me.jastz.helloserviceapi.service;

import me.jastz.helloserviceapi.vo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zhiwen on 2017/8/22.
 */
//@RequestMapping //此处不要加RequestMapping注解，否则会当做controller来扫描
public interface IHelloService {
    @GetMapping("hello")
    String hello();

    @GetMapping("hello1")
    User hello(@RequestParam("name") String name, @RequestParam("age") Integer age);
}
