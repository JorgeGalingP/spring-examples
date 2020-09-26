package com.galing.spring.firstapp.controllers;

import com.galing.spring.firstapp.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/profile")
public class ProfileController {
    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String profile(Model model){
        User user = new User("Jorge", "Galindo", "jorgape225@gmail.com");

        model.addAttribute("title", user.getName() + "'s profile");
        model.addAttribute("user", user);

        return "profile";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String profileAll(Model model){
        User user1 = new User("Jorge", "Galindo", "jorgape225@gmail.com");
        User user2 = new User("Diana", "Morcillo", "didi_make@gmail.com");
        User user3 = new User("Fer", "Galindo", "ferga@gmail.com");

        List<User> users = Arrays.asList(user1, user2, user3);

        model.addAttribute("title", "Users list");
        model.addAttribute("users", users);

        return "profileAll";
    }

    @ModelAttribute("users_example")
    public List<User> getUsersExample(){
        // can be used in all HomeController's templates
        User user1 = new User("Jorge", "Galindo", "jorgape225@gmail.com");
        User user2 = new User("Diana", "Morcillo", "didi_make@gmail.com");
        User user3 = new User("Fer", "Galindo", "ferga@gmail.com");

        return Arrays.asList(user1, user2, user3);
    }
}
