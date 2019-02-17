package com.s2u2m.lab.spring.security.authentication.authentication;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * WebSecurityConfig
 * Create by Yangyang.xia on 8/8/18
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // filter pattern
        http.antMatcher("/account/basic/login")
            .authorizeRequests()
            // request should be authenticated
            .anyRequest().authenticated()
            .and()
            // enable http basic auth
            .httpBasic();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // config AuthenticationProvider into ProviderManager
        auth.authenticationProvider(new BasicAuthenticationProvider());
    }

}
