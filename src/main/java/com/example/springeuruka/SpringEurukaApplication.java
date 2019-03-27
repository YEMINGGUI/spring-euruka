package com.example.springeuruka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringEurukaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEurukaApplication.class, args);
    }

}
