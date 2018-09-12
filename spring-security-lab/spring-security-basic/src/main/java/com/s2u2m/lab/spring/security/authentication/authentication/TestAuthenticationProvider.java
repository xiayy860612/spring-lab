package com.s2u2m.lab.spring.security.authentication.authentication;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

/**
 * TestAuthenticationProvider create on 2018/9/12
 *
 * @author Amos Xia
 */
public class TestAuthenticationProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return null;
    }

    @Override
    public boolean supports(Class<?> cls) {
        return UsernamePasswordAuthenticationToken.class
                .isAssignableFrom(cls);
    }
}
