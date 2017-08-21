package me.jastz.helloconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhiwen on 2017/8/21.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hello() {
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
    }
}
