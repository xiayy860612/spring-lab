package com.s2u2m.lab.spring.security.authentication.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AccountController
 * Create by Yangyang.xia on 8/8/18
 */
@RestController
@RequestMapping(value = "/account/basic")
public class AccountController {

    @GetMapping(value = "/login")
    public String helloUser() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return String.format("Hello %s", user.getUsername());
    }
}
