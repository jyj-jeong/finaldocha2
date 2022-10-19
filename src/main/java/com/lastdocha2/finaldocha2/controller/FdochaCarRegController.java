package com.lastdocha2.finaldocha2.controller;


import com.lastdocha2.finaldocha2.dto.UserDTO;
import com.lastdocha2.finaldocha2.service.Fdochauserservice2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/app")
public class FdochaCarRegController {

    @Autowired
    Fdochauserservice2 userService2;

    @RequestMapping(value = "/car_regist")
    public ResponseEntity<?> carㄲegist(@RequestParam Map<String, Object> reqParam, HttpServletRequest request, ModelAndView mv
            , Authentication authentication, HttpSession session ) {
        System.out.println("로그인");

        System.out.println(request);
        System.out.println(request);
//            System.out.println(authentication.getName());
//            System.out.println(authentication.getAuthorities());
        UserDTO userresponseDTO = userService2.loginService2(reqParam.get("userId").toString(),reqParam.get("userPw").toString());

        System.out.println(userresponseDTO + "         컨트롤러 리턴값");

//        System.out.println(userresponseDTO.getId() + "         컨트롤러 리턴값");
//        responseDTO.setResultCode("S0001");
        if(userresponseDTO !=null){
            session.setAttribute("userInfo",userresponseDTO);
            return new ResponseEntity<>(userresponseDTO, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(userresponseDTO, HttpStatus.BAD_REQUEST);
        }
    }

//    @RequestMapping(value = "/login/success")
//    public String login(@RequestParam Map<String, Object> reqParam, Authentication authentication) {
//        System.out.println("로그인 성공로직");
//        System.out.println(reqParam);
//        System.out.println(authentication);
//        System.out.println(HttpStatus.OK);
//
//        return "contractlist";
//    }
}
