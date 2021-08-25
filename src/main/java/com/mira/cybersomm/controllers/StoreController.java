package com.mira.cybersomm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StoreController {

    @GetMapping("/store")
    String store()  {
        return "store";
    }
}
