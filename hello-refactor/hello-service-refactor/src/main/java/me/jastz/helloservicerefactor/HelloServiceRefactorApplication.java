package me.jastz.helloservicerefactor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HelloServiceRefactorApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloServiceRefactorApplication.class, args);
    }
}
