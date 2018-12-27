package com.bakman.spring_it.controller;

import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/")
    public String hello() {
        return "index";
    }

}
