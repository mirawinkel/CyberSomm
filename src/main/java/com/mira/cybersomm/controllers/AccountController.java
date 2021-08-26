package com.mira.cybersomm.controllers;

import com.mira.cybersomm.models.Role;
import com.mira.cybersomm.models.User;
import com.mira.cybersomm.services.RoleService;
import com.mira.cybersomm.services.UserService;
import com.mira.cybersomm.models.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.security.Principal;
import java.util.HashSet;
import java.util.Set;

@Controller
public class AccountController {


    private final RoleService roleService;
    private final UserService userService;

    @Autowired
    public AccountController(UserService userService, RoleService roleService)
    {
        this.roleService = roleService;
        this.userService = userService;
    }

    @ModelAttribute("user")
    public User user() {
        return new User();
    }
//
    @GetMapping("/login")
    public String login(@RequestParam(value = "error", defaultValue = "false") boolean loginError, @RequestParam(value = "noUser", defaultValue = "false") boolean noUser ,Model model) {
        //handler for html expression of spring security login fail
        if(loginError) {
            model.addAttribute("loginError", "Email or Password invalid");
        }
        //handler for html expression of no user login fail
        if(noUser) {
            model.addAttribute("noUser", "Please Login to access User Pages");
        }
        return "login";
    }

    @GetMapping("/loginSuccess")
    public String loginSuccess(Model model, Principal principal)
    {
        //return login page using the name from the principal object to find a user record and extracting the Username
        String name = userService.findUserByEmail(principal.getName()).getUsername();
        model.addAttribute("name", name);
        return "loginSuccess";
    }

    @GetMapping("/loginFail")
    public String loginFail() {
        return "loginFail";
    }

    @GetMapping("/logoutSuccess")
    public String logoutSuccess()
    {
        return "logoutSuccess";
    }

    @GetMapping("/register")
    String register() {
        return "register";
    }

    @PostMapping("/register")
    public String submitForm(@Valid @ModelAttribute("user") User user, Model model, BindingResult bindingResult) {
        user.isEquals = user.getPassword().equals(user.getPasswordRepeat());
        if(bindingResult.hasErrors()) {
            return "register";
        } else if (!user.isEquals) {
            model.addAttribute("passError", "Passwords do not match");
            return "register";
        } else if (userService.findUserByEmail(user.getEmail()) != null) {
            model.addAttribute("exists", "Account with that email already exists");
            return "register";
        }
        //Automatically assign the USER role to newly registered users
        Role role = roleService.findRoleById(2);
        Set<Role> roles = new HashSet<Role>();
        roles.add(role);
        user.setRoles(roles);
        userService.encodePassword(user);
        userService.save(user);
        return "registerSuccess";
    }

    @GetMapping("/user/accountHome")
    public String accountHome(Model model, Authentication authentication) {
        CustomUserDetails userDetails = (CustomUserDetails) authentication.getPrincipal();
        User currentUser = userService.findUserByEmail(userDetails.getUsername());
        model.addAttribute("currentUser", currentUser);
        return "/user/accountHome";
    }

    @GetMapping("/sure")
    public String sure() {
        return "sure";
    }


    @PostMapping("/delete")
    public String deleteAccount(Model model, Authentication authentication) {
        CustomUserDetails userDetails = (CustomUserDetails) authentication.getPrincipal();
        User currentUser = userService.findUserByEmail(userDetails.getUsername());
        model.addAttribute("currentUser", currentUser);
        userService.deleteUserByEmail(currentUser.getEmail());
        return "deleteSuccess";
    }
}
