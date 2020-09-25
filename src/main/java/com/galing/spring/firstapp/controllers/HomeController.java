package com.galing.spring.firstapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/app")
public class HomeController {

    @RequestMapping(value = {"", "/", "/home", "/index"}, method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("title", "Hello World, Spring!");
        return "home";
    }
}
