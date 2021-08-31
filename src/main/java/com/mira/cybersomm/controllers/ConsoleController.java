package com.mira.cybersomm.controllers;

import com.mira.cybersomm.exceptions.NoSqlRecordException;
import com.mira.cybersomm.exceptions.SqlError;
import com.mira.cybersomm.models.Role;
import com.mira.cybersomm.models.User;
import com.mira.cybersomm.models.Vendor;
import com.mira.cybersomm.models.Wine;
import com.mira.cybersomm.services.RoleService;
import com.mira.cybersomm.services.UserService;
import com.mira.cybersomm.services.VendorService;
import com.mira.cybersomm.services.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashSet;
import java.util.Set;

@Controller
public class ConsoleController {

    UserService userService;
    WineService wineService;
    VendorService vendorService;
    RoleService roleService;

    @Autowired
    public ConsoleController(UserService userService, WineService wineService, VendorService vendorService, RoleService roleService) {
        this.userService = userService;
        this.wineService = wineService;
        this.vendorService = vendorService;
        this.roleService = roleService;
    }

    @ModelAttribute("user")
    public User user() {
        return new User();
    }

    @GetMapping("/admin/console")
    public String adminConsole() {
        return "/admin/console";
    }

    @GetMapping("/admin/user_console")
    public String userConsole() {
        return "/admin/user_console";
    }

    @GetMapping("/admin/wineConsole")
    public String wineConsole(Model model) {
        Wine wine = new Wine();
        model.addAttribute("wine", wine);
        return "/admin/wine_console";
    }

    @GetMapping("/admin/vendorConsole")
    public String vendorConsole(Model model) {
        Vendor vendor = new Vendor();
        model.addAttribute("vendor", vendor);
        return "/admin/vendor_console";
    }

    @PostMapping("/admin/userUpdate")
    public String userUpdate(@ModelAttribute("user") User user, Model model) {
        user.setPassword(userService.findUserByEmail(user.getEmail()).getPassword());
        //Find all non Admin users
        Role role = roleService.findRoleById(2);
        Set<Role> roles = new HashSet<>();
        roles.add(role);
        //Ensure that all modified users retain USER role
        user.setRoles(roles);
        userService.save(user);
        model.addAttribute("update", true);
        return "/admin/user_console";
    }

    @PostMapping("/admin/userFind")
    public String userFind(@ModelAttribute("user") User user, Model model) {
        //Populate update fields based on accessing records through email address
        User record = userService.findUserByEmail(user.getEmail());
        if (record == null) {
            record = new User();
        }
        model.addAttribute("user", record);
        return "/admin/user_console";
    }

    @PostMapping("/admin/vendorUpdate")
    public String vendorUpdate(@ModelAttribute("vendor") Vendor vendor, Model model) {
        //Update vendor records
        model.addAttribute("update", true);
        vendorService.save(vendor);
        return "/admin/vendor_console";
    }

    @PostMapping("/admin/vendorFind")
    public String vendorFind(@ModelAttribute("vendor") Vendor vendor, Model model) {
        //find vendors utilizing "Select Vendor" Id input
        Vendor record = vendorService.findVendorById(vendor.getId());
        if (record == null) {
            record = new Vendor();
            record.setId(0);
        }
        model.addAttribute("vendor", record);
        return "/admin/vendor_console";
    }

    @PostMapping("/admin/wineUpdate")
    public String wineUpdate(@ModelAttribute("wine") Wine wine,Model model) {
        //update existing wine records
        model.addAttribute("update", true);
        wineService.save(wine);
        return "/admin/wine_console";
    }

    @PostMapping("/admin/wineFind")
    public String wineFind(@ModelAttribute("wine") Wine wine, Model model) {
        //populate update inputs based on retrieving wine records utilizing id numbers
        Wine record = wineService.findWineById(wine.getId());
        if (record == null) {
            record = new Wine();
            record.setId(0);
        }
        model.addAttribute("wine", record);
        return "/admin/wine_console";
    }

    @PostMapping("/admin/wineDelete")
    public String wineDelete(@ModelAttribute("wine") Wine wine, Model model) {
        //delete wine records utilizing id numbers
        wineService.deleteWineById(wine.getId());
        model.addAttribute("deleted", true);
        return "/admin/wine_console";
    }

    @PostMapping("/admin/userDelete")
    public String userDelete(@ModelAttribute("user") User user, Model model) {
        //delete user files utilizing email address
        userService.deleteUserByEmail(user.getEmail());
        model.addAttribute("deleted", true);
        return "/admin/user_console";
    }

    @PostMapping("/admin/vendorDelete")
    public String vendorDelete(@ModelAttribute("vendor") Vendor vendor, Model model) {
        //delete vendor records utilizing id numbers
        vendorService.deleteById(vendor.getId());
        model.addAttribute("deleted", true);
        return "/admin/vendor_console";
    }

    @GetMapping("/user/favorites")
    public String favorites(Model model) throws NoSqlRecordException {
        //utilize the authenticated user record to access their user file in the database
        try {
            String email = SecurityContextHolder.getContext().getAuthentication().getName();
            User user = userService.findUserByEmail(email);
            //Add their favorites to the view model
            Set<Wine> userFavorites = user.getFavorites();
            model.addAttribute("favorites", userFavorites);
        }catch(Exception e) {
            User unregistered = new User();
            Set<Wine> userFavorites = unregistered.getFavorites();
            model.addAttribute("favorites", userFavorites);
            throw new NoSqlRecordException("No user record when utilizing built in admin class", e, SqlError.NO_RECORD_CHOSEN);
        }
        Wine wine = new Wine();
        model.addAttribute("wine", wine);
        return "/user/favorites";
    }

    @PostMapping("/user/favoriteRemove")
    public String favoriteRemove(@ModelAttribute("wine") Wine wine, Model model) {
        //Remove Wine From User Favorites List
        //Access user file through the authentication object
        String email = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userService.findUserByEmail(email);
        //find the matching wine file from the database and use it to update the favorites list if it exists within it. If it does, add deleted to the model to display an update message, if not, add noExist to display a corresponding message in the template.
        Wine activeWine = wineService.findWineById(wine.getId());
        if (user.getFavorites().contains(wine)) {
            user.getFavorites().remove(activeWine);
            Set<Wine> userFavorites = user.getFavorites();
            model.addAttribute("favorites", userFavorites);
            model.addAttribute("deleted", true);
            userService.save(user);
        } else {
            model.addAttribute("noExist", true);
            Set<Wine> userFavorites = user.getFavorites();
            model.addAttribute("favorites", userFavorites);
        }
        return "/user/favorites";
    }
}