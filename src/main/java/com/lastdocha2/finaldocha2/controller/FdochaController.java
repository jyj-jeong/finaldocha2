package com.lastdocha2.finaldocha2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FdochaController {
    @RequestMapping("/")
    public  String login(Model model){

        return "login";
    }
    @RequestMapping("/home")
    public  String home(Model model){

        return "index";
    }
}
