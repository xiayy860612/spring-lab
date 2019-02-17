package com.s2u2m.lab.spring.security.authentication.controller;

import com.s2u2m.lab.spring.security.authentication.dto.AccessTokenDto;
import org.springframework.security.core.context.SecurityContextHolder;
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
    public AccessTokenDto getAccessToken() {
        String user = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        AccessTokenDto accessTokenDto = new AccessTokenDto();
        accessTokenDto.setAccessToken(user);
        return accessTokenDto;
    }
}
