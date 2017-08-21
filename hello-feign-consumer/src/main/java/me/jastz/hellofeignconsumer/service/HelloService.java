package me.jastz.hellofeignconsumer.service;

import me.jastz.hellofeignconsumer.vo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zhiwen on 2017/8/21.
 */
@FeignClient("hello-service")
public interface HelloService {

    @GetMapping("/hello")
    String hello();

    @GetMapping("/hello1")
    User hello(@RequestParam("name") String name, @RequestParam("age") Integer age);
}
