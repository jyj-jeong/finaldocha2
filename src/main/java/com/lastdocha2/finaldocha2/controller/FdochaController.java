package com.lastdocha2.finaldocha2.controller;


import com.lastdocha2.finaldocha2.dto.UserDTO;
import com.lastdocha2.finaldocha2.service.Fdochauserservice2;
import com.lastdocha2.finaldocha2.service.LoginCheckservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class FdochaController {

    @Autowired
    Fdochauserservice2 userService2;
    @Autowired
    LoginCheckservice loginCheckservice;


    @RequestMapping("/")
    public  String loginpage(Model model){
        return "login";
    }
    @RequestMapping("/login")
    public  String login(Model model){
        System.out.println("zz");
        return "login";
    }
    @RequestMapping("/home")
    public ModelAndView home(Model model , HttpServletRequest request,ModelAndView mv){
        mv = loginCheckservice.loginCheckservice(request,mv);
        System.out.println(mv.getModel().get("notLogin") +"     낫 로그인 체크");
       if(mv.getModel().get("notLogin") != null){
           System.out.println("낫 로그인 상태");
           return mv;
       }
        else{
           mv.setViewName("contractlist");
           System.out.println("홉 페이지");
           System.out.println(request.getSession());
           System.out.println(request.getSession().toString());
           System.out.println(request.getAttribute("userInfo"));
           System.out.println(request.getSession().getAttribute("userInfo"));
           return mv;
       }
    }
    @RequestMapping("/contractlist")
    public  ModelAndView contractList(Model model , HttpServletRequest request ,ModelAndView mv){

        mv = loginCheckservice.loginCheckservice(request,mv);
        if(mv.getModel().get("notLogin") != null){
            return mv;
        }
        else{
            mv.setViewName("contractlist");
            return mv;
        }
    }
    @RequestMapping("/cardetail")
    public  ModelAndView cardetail(Model model , HttpServletRequest request ,ModelAndView mv){

        mv = loginCheckservice.loginCheckservice(request,mv);

        if(mv.getModel().get("notLogin") != null){
            return mv;
        }
        else{
            mv.setViewName("cardetail");
            return mv;
        }
    }
    @RequestMapping("/login/denied")
    public  String denied(Model model){
        System.out.println("접근거부");
        return "login";
    }
    @RequestMapping(value = "/login/success")
    public String login(@RequestParam Map<String, Object> reqParam, Authentication authentication, HttpServletRequest request) {
        System.out.println("로그인 성공로직");
        System.out.println(HttpStatus.OK);
        System.out.println(authentication);
        System.out.println(reqParam);
        System.out.println(request);
//                UserDTO userresponseDTO = userService2.loginService2(reqParam.get("userId").toString(),reqParam.get("userPw").toString());

        return "contractlist";
    }
    @RequestMapping(value = "/login/logout")
    public String logout(@RequestParam Map<String, Object> reqParam, Authentication authentication) {
        System.out.println("로그아웃");
        System.out.println(HttpStatus.OK);
        System.out.println(authentication);
         return "login";
    }
    @RequestMapping(value = "/logoutgo")
    public String logoutNotSe(@RequestParam Map<String, Object> reqParam, Authentication authentication,HttpServletRequest request) {
        System.out.println("로그아웃");
        System.out.println(HttpStatus.OK);
        System.out.println(authentication);
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();   // 세션 날림
        }
        System.out.println(request.getSession().getAttribute("userInfo"));
        System.out.println(request.getSession().toString());

        return "login";
    }

    @RequestMapping(value = "/damagecheck")
    public String carDamage(@RequestParam Map<String, Object> reqParam) {


        return "carDamage";
    }

    @RequestMapping(value = "/car_regist")
    public ModelAndView carRegist(Model model , HttpServletRequest request ,ModelAndView mv) {
        mv = loginCheckservice.loginCheckservice(request,mv);

        if(mv.getModel().get("notLogin") != null){
            return mv;
        }
        else{
            mv.setViewName("carRegist");
            return mv;
        }
    }
}
