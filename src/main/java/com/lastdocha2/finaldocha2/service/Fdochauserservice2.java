package com.lastdocha2.finaldocha2.service;

import com.lastdocha2.finaldocha2.dao.FdochaUserDao;
import com.lastdocha2.finaldocha2.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class Fdochauserservice2 {

    @Autowired
    FdochaUserDao userDao;

    public UserDTO loginService2(String userId, String userPw){
        UserDTO userdto = new UserDTO();

        UserDTO userInfo = userDao.loginDao2(userId, userPw);
        System.out.println("서비스 시작");

        return userInfo;
    }

}
