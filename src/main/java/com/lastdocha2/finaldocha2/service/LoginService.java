package com.lastdocha2.finaldocha2.service;


import com.lastdocha2.finaldocha2.dao.FdochaUserDao;
import com.lastdocha2.finaldocha2.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class LoginService  implements UserDetailsService {


//    public UserDetails loginService(String userId, String userPw){
//        UserDTO userdto = new UserDTO();
////
////        UserDetails userInfo = userDao.loginDao(userId, userPw);
//        System.out.println("서비스 시작");
//
//        return userInfo;
//    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("서비스 시작");
        List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
        roles.add(new SimpleGrantedAuthority("ROLE_USER"));
        return  new User(username, username, roles);
    }
}
