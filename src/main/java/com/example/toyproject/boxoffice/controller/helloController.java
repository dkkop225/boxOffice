package com.example.toyproject.boxoffice.controller;

import com.example.toyproject.boxoffice.service.APIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class helloController {

    @Autowired
    APIService apiService;

    @RequestMapping("/")
    public String hello(Model model){

        apiService.getAPIData();
        model.addAttribute("message","Hello Spring boot this is thymeleaf");
        return "/hello";
    }
}
