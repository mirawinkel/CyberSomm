package com.mira.cybersomm.controllers;

import com.mira.cybersomm.models.User;
import com.mira.cybersomm.models.Vendor;
import com.mira.cybersomm.models.Wine;
import com.mira.cybersomm.services.CustomUserDetailsService;
import com.mira.cybersomm.services.UserService;
import com.mira.cybersomm.services.VendorService;
import com.mira.cybersomm.services.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SommelierController {


    public WineService wineService;
    public VendorService vendorService;
    public UserService userService;
    public CustomUserDetailsService userDetailsService;

    @Autowired
    public SommelierController (WineService wineService, VendorService vendorService, UserService userService, CustomUserDetailsService userDetailsService) {
        this.wineService = wineService;
        this.vendorService = vendorService;
        this.userService = userService;
        this.userDetailsService = userDetailsService;
    }

    @GetMapping("/sommelier")
    String sommelier() {
        return "sommelier";
    }

    @GetMapping("/wineInformation")
    String wineInfo(@RequestParam long wineId, Model model) {
        model.addAttribute("wineId", wineId);
        Wine wine = wineService.findWineById(wineId);
        Iterable<Vendor> vendors = vendorService.findVendorsByWineListIsContaining(wine);
        model.addAttribute("wine", wine);
        model.addAttribute("vendors", vendors);
        return "wineInformation";
    }

    @GetMapping("/addFavorite")
    String addFavorite(@RequestParam long id, Model model) {
        //utilize the authenticated user record to access their user file in the database
        String email = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userService.findUserByEmail(email);
        Wine wine = wineService.findWineById(id);
        //Save wine to the user favorites list
        user.getFavorites().add(wine);
        userService.save(user);
        //populate vendor field to ensure page display remains consistent
        Iterable<Vendor> vendors = vendorService.findVendorsByWineListIsContaining(wine);
        model.addAttribute("wine", wine);
        model.addAttribute("vendors", vendors);
        model.addAttribute("favorite", true);
        return "wineInformation";
    }
}
