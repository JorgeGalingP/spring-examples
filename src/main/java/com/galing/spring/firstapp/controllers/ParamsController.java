package com.galing.spring.firstapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class ParamsController {

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public String oneProfile(@RequestParam String id, Model model){
        model.addAttribute("title", "HTTp GET Request params");
        model.addAttribute("result", "The param is: " + id);

        return "params";
    }
}
