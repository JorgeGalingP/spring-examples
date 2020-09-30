package com.galing.spring.firstapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/constant")
public class ConstantController {

    @RequestMapping(value = "redirect", method = RequestMethod.GET)
    public String home(Model model){
        return "redirect:/app/home";
    }

    @RequestMapping(value = "youtube", method = RequestMethod.GET)
    public String redirectToGoogle(Model model){
        return "redirect:https://www.youtube.com/";
    }

    @RequestMapping(value = "forward", method = RequestMethod.GET)
    public String forwardToGoogle(Model model){
        return "forward:/app/index";
    }
}
