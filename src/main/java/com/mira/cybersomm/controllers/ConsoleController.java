package com.mira.cybersomm.controllers;

import com.mira.cybersomm.models.Role;
import com.mira.cybersomm.models.User;
import com.mira.cybersomm.models.Vendor;
import com.mira.cybersomm.models.Wine;
import com.mira.cybersomm.services.RoleService;
import com.mira.cybersomm.services.UserService;
import com.mira.cybersomm.services.VendorService;
import com.mira.cybersomm.services.WineService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/admin/userConsole")
    public String userConsole() {
        return "/admin/userConsole";
    }

    @GetMapping("/admin/wineConsole")
    public String wineConsole(Model model) {
        Wine wine = new Wine();
        model.addAttribute("wine", wine);
        return "/admin/wineConsole";
    }

    @GetMapping("/admin/vendorConsole")
    public String vendorConsole(Model model) {
        Vendor vendor = new Vendor();
        model.addAttribute("vendor", vendor);
        return "/admin/vendorConsole";
    }

    @PostMapping("/admin/userUpdate")
    public String userUpdate(@ModelAttribute("user") User user, Model model) {
        user.setPassword(userService.findUserByEmail(user.getEmail()).getPassword());
        Role role = roleService.findRoleById(2);
        Set<Role> roles = new HashSet<>();
        roles.add(role);
        user.setRoles(roles);
        userService.save(user);
        model.addAttribute("update", true);
        return "/admin/userConsole";
    }

    @PostMapping("/admin/userFind")
    public String userFind(@ModelAttribute("user") User user, Model model) {
        User record = userService.findUserByEmail(user.getEmail());
        if (record == null) {
            record = new User();
        }
        model.addAttribute("user", record);
        return "/admin/userConsole";
    }

    @PostMapping("/admin/vendorUpdate")
    public String vendorUpdate(@ModelAttribute("vendor") Vendor vendor, Model model) {
            model.addAttribute("update", true);
            vendorService.save(vendor);
        return "/admin/vendorConsole";
    }

    @PostMapping("/admin/vendorFind")
    public String vendorFind(@ModelAttribute("vendor") Vendor vendor, Model model) {
        Vendor record = vendorService.findVendorById(vendor.getId());
        if (record == null) {
            record = new Vendor();
            record.setId(0);
        }
        model.addAttribute("vendor", record);
        return "/admin/vendorConsole";
    }

    @PostMapping("/admin/wineUpdate")
    public String wineUpdate(@ModelAttribute("wine") Wine wine,Model model) {
        model.addAttribute("update", true);
        wineService.save(wine);
        return "/admin/wineConsole";
    }

    @PostMapping("/admin/wineFind")
    public String wineFind(@ModelAttribute("wine") Wine wine, Model model) {
        Wine record = wineService.findWineById(wine.getId());
        if (record == null) {
            record = new Wine();
            record.setId(0);
        }
        model.addAttribute("wine", record);
        return "/admin/wineConsole";
    }

    @PostMapping("/admin/wineDelete")
    public String wineDelete(@ModelAttribute("wine") Wine wine, Model model) {
        wineService.deleteWineById(wine.getId());
        model.addAttribute("deleted", true);
        return "/admin/wineConsole";
    }
    @PostMapping("/admin/userDelete")
    public String userDelete(@ModelAttribute("user") User user, Model model) {
        userService.deleteUserByEmail(user.getEmail());
        model.addAttribute("deleted", true);
        return "/admin/userConsole";
    }
    @PostMapping("/admin/vendorDelete")
    public String wineDelete(@ModelAttribute("vendor") Vendor vendor, Model model) {
        vendorService.deleteById(vendor.getId());
        model.addAttribute("deleted", true);
        return "/admin/vendorConsole";
    }

}
