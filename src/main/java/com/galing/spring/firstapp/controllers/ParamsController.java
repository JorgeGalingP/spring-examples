package com.galing.spring.firstapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/params")
public class ParamsController {

    @RequestMapping(value = {"/show"}, method = RequestMethod.GET)
    public String paramSender(@RequestParam(name="param", required = false, defaultValue = "Don't exists.") String param, Model model){
        model.addAttribute("title", "HTTP GET Request params from URL:");
        model.addAttribute("result", "The param is: " + param);

        return "paramShow";
    }

    @RequestMapping(value = {"/send"}, method = RequestMethod.GET)
    public String paramReceiver(Model model){
        model.addAttribute("title", "HTTP GET Send params:");

        return "paramSender";
    }

    @RequestMapping(value = {"/mix"}, method = RequestMethod.GET)
    public String paramMix(@RequestParam String string, @RequestParam Integer number, Model model){
        model.addAttribute("title", "HTTP GET Send params:");
        model.addAttribute("test", "The selected string is " + string + " and the number is " + number);

        return "paramShow";
    }

    @RequestMapping(value = {"/mix-servlet"}, method = RequestMethod.GET)
    public String paramMix(HttpServletRequest request, Model model){
        String string = request.getParameter("string");
        int number;
        try {
            number = Integer.parseInt(request.getParameter("number"));
        }catch (NumberFormatException ex){
            number = 0;
            ex.printStackTrace();
        }

        model.addAttribute("title", "HTTP GET Send params:");
        model.addAttribute("test", "The selected string is " + string + " and the number is " + number);

        model.addAttribute("title", "HTTP GET Send params:");

        return "paramShow";
    }
}
