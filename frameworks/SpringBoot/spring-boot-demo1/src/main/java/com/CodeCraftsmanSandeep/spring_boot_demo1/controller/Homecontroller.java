package com.CodeCraftsmanSandeep.spring_boot_demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// creating one rest endpoint to serve the request
@Controller
@ResponseBody // return the data in response bodyu like json (or) xml
public class Homecontroller {

    @RequestMapping("/")
    public String home(){
        return "Hello, Welcome to spring boot world";
    }
}
