package com.lastdocha2.finaldocha2.service;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Service
public class LoginCheckservice {

    public ModelAndView loginCheckservice(HttpServletRequest request , ModelAndView mv){
        System.out.println( request.getSession().getAttribute("userInfo")+"     세션상태 체크");
        if(request.getSession().getAttribute("userInfo") ==null){
            mv.addObject("notLogin","notlogin");
            mv.setViewName("login");
            return  mv;
        }
        else{
//            HttpSession session =null;
//            session.setAttribute("userInfo",request.getSession().getAttribute("userInfo"));
            mv.addObject("userInfo",request.getSession().getAttribute("userInfo"));
            return mv;
        }

    }
}
