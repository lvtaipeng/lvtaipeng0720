package com.lvtaipeng.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.lvtaipeng.user.mapper")
public class StartEureka {
    public static void main(String[] args) {
        SpringApplication.run(StartEureka.class);
    }
}