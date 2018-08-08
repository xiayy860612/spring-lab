package com.s2u2m.lab.spring.security.lab01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * IndexController
 * Create by Yangyang.xia on 8/8/18
 */
@RestController
public class IndexController {

    @GetMapping(value = "/")
    public String index() {
        return "hello world";
    }
}
