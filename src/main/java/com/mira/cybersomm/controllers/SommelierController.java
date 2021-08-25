package com.mira.cybersomm.controllers;

import com.mira.cybersomm.models.User;
import com.mira.cybersomm.models.Vendor;
import com.mira.cybersomm.models.Wine;
import com.mira.cybersomm.services.UserService;
import com.mira.cybersomm.services.VendorService;
import com.mira.cybersomm.services.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
public class SommelierController {


    public WineService wineService;
    public VendorService vendorService;
    public UserService userService;

    @Autowired
    public SommelierController (WineService wineService, VendorService vendorService, UserService userService) {
        this.wineService = wineService;
        this.vendorService = vendorService;
        this.userService = userService;
    }

    @GetMapping("/sommelier")
    String sommelier() {
        return "sommelier";
    }

    @GetMapping("/wineInformation")
    String wineInfo(@RequestParam long wineId, Model model, Principal principal) {
        Wine wine = wineService.findWineById(wineId);
        if(principal != null) {
            User user = userService.findUserByUsername(principal.getName());
            model.addAttribute("user", user);
        } else {
            model.addAttribute("login", "Please Login to Access Favorites");
        }
        Iterable<Vendor> vendors = vendorService.findVendorsByWineListIsContaining(wine);
        model.addAttribute("wine", wine);
        model.addAttribute("vendors", vendors);
        return "wineInformation";
    }
}
