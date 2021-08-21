package com.reflectionwebdesign.cybersomm.controllers;

import com.reflectionwebdesign.cybersomm.models.Vendor;
import com.reflectionwebdesign.cybersomm.models.Wine;
import com.reflectionwebdesign.cybersomm.services.UserService;
import com.reflectionwebdesign.cybersomm.services.VendorService;
import com.reflectionwebdesign.cybersomm.services.WineService;
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
//        User user = userService.findUserByUsername(principal.getName());
//        model.addAttribute("user", user);
        Iterable<Vendor> vendors = vendorService.findVendorsByWineListIsContaining(wine);
        model.addAttribute("wine", wine);
        model.addAttribute("vendors", vendors);
        return "wineInformation";
    }
}
