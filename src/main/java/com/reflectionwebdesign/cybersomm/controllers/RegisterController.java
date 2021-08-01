package com.reflectionwebdesign.cybersomm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {
    @GetMapping("/register")
    String register() {
        return "register";
    }
}
