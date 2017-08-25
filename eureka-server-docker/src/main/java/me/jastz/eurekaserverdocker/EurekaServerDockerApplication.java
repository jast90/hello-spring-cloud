package me.jastz.eurekaserverdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerDockerApplication.class, args);
    }
}
