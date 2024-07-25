package com.example.CustomDBAuthentication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class WelcomeController {
@GetMapping("/welcome-page")
public String welcome(){
    return "welcome";
}
    @GetMapping("/login-page")
    public String login(){
        return "login";
    }


    @GetMapping("/register")
    public String register(){
        return "register";
    }


}
