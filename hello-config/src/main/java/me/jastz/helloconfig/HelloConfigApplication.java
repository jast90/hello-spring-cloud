package me.jastz.helloconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class HelloConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloConfigApplication.class, args);
    }
}
