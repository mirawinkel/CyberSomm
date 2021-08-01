package com.reflectionwebdesign.cybersomm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SommelierController {

    @GetMapping("/sommelier")
    String sommelier() {
        return "sommelier";
    }
}
