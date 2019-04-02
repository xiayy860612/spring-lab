package com.s2u2m.lab.spring.springzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringZipkinApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringZipkinApplication.class, args);
    }
}
