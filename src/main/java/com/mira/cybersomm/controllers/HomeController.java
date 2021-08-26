package com.mira.cybersomm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/about")
    String about() {
        return "about";
    }

    @GetMapping
    String getIndex() {
        return "index";
    }

    @GetMapping("/index")
    String index() {
        return "index";
    }

    @GetMapping("/store")
    String store()  {
        return "store";
    }
}
