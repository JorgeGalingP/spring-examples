package com.galing.spring.firstapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/variables")
public class VariableRouteController {

    @RequestMapping(value = {"", "/", "/home", "/index"}, method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("title", "Enviar parámetros de la ruta(@PathVariable)");

        return "variables/home";
    }

    @GetMapping("/string/{text}")
    public String variables(@PathVariable(name="text") String stringText, Model model){
        model.addAttribute("title", "Recibir parámetros de la ruta(@PathVariable)");
        model.addAttribute("result", "El parámetro de la ruta es: " + stringText);

        return "variables/show";
    }

    @GetMapping("/string/{text}/{number}")
    public String variables(@PathVariable(name="text") String stringText, @PathVariable Integer number, Model model){
        model.addAttribute("title", "Recibir dos parámetros de la ruta(@PathVariable)");
        model.addAttribute("result", "El parámetro de la ruta es: " + stringText + " y el numbero es: " + number);

        return "variables/show";
    }
}
