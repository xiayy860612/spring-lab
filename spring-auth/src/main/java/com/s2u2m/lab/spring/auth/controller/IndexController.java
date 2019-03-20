package com.s2u2m.lab.spring.auth.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Secured("ROLE_ADMIN")
    @GetMapping("/{ping}")
    public String index(@PathVariable("ping") String ping) {
        return ping;
    }
}
