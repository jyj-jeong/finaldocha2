package com.lastdocha2.finaldocha2.dao;


import com.lastdocha2.finaldocha2.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.type.Alias;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
@Repository
@Alias("FdochaUserDao")
public interface FdochaUserDao {

    UserDetails loginDao(String userId, String userPw);

    UserDTO loginDao2(String userId, String userPw);
}
