package com.hanzhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hanzhi.dao")
@EnableAutoConfiguration
@SpringBootApplication
public class AuthTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthTestApplication.class, args);
    }
}
