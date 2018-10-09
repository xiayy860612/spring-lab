package com.s2u2m.lab.spring.security.authentication.authentication;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;

/**
 * BasicAuthenticationProvider create on 2018/9/12
 *
 * @author Amos Xia
 */
public class BasicAuthenticationProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        UsernamePasswordAuthenticationToken token =
                (UsernamePasswordAuthenticationToken) authentication;
        String username = (String) token.getPrincipal();
        String password = (String) token.getCredentials();
        if ("xiayy".equals(username) && "123456".equals(password)) {
            List<SimpleGrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority("USER"));
            return new UsernamePasswordAuthenticationToken(
                    token.getPrincipal(), token.getCredentials(), authorities);
        }

        throw new BadCredentialsException("username or password not correct");
    }

    @Override
    public boolean supports(Class<?> cls) {
        return UsernamePasswordAuthenticationToken.class
                .isAssignableFrom(cls);
    }
}
