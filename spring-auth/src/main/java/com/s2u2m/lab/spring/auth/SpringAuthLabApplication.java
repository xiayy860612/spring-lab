package com.s2u2m.lab.spring.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringAuthLabApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringAuthLabApplication.class, args);
    }
}
