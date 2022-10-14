package com.lastdocha2.finaldocha2.controller;

import com.lastdocha2.finaldocha2.dto.UserDTO;

import com.lastdocha2.finaldocha2.service.Fdochauserservice2;
import com.lastdocha2.finaldocha2.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    LoginService loginService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String userId = (String)authentication.getPrincipal();
        String userPassword = (String)authentication.getCredentials();

        System.out.println(userId + "     userId");
        System.out.println(userPassword + "     userPassword");

        //로그인 로직 구현
        UserDetails user = loginService.loadUserByUsername(userId);

        System.out.println("인증 시작");
        System.out.println(user);
        System.out.println(user);

        return new UsernamePasswordAuthenticationToken(user.getUsername(), userPassword, user.getAuthorities());
    }
    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}
