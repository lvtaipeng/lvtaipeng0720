package com.jtp.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class StartEureka {
    public static void main(String[] args) {
        SpringApplication.run(StartEureka.class);
    }
}
