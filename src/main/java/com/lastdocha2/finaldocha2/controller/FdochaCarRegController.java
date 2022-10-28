package com.lastdocha2.finaldocha2.controller;


import com.lastdocha2.finaldocha2.dto.ContractDTO;
import com.lastdocha2.finaldocha2.service.ConstractService;
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
    ConstractService constractService;

    @RequestMapping(value = "/car_regist")
    public ResponseEntity<?> car_regist(@RequestParam Map<String, Object> reqParam, HttpServletRequest request, ModelAndView mv
            , Authentication authentication, HttpSession session, ContractDTO contractDTO) {
        System.out.println("저장");

        System.out.println(contractDTO.toString());
        System.out.println(request);
//            System.out.println(authentication.getName());
//            System.out.println(authentication.getAuthorities());
       int sign = constractService.carRegistService(contractDTO);

        System.out.println(contractDTO.toString());
        System.out.println(sign + "       확인코드");
        return new ResponseEntity<>( HttpStatus.OK);
//        if(userresponseDTO !=null){
//            session.setAttribute("userInfo",userresponseDTO);
//            return new ResponseEntity<>(userresponseDTO, HttpStatus.OK);
//        }else{
//            return new ResponseEntity<>(userresponseDTO, HttpStatus.BAD_REQUEST);
//        }
    }

}
