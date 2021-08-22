package com.reflectionwebdesign.cybersomm.controllers;

import com.reflectionwebdesign.cybersomm.models.Role;
import com.reflectionwebdesign.cybersomm.models.User;
import com.reflectionwebdesign.cybersomm.services.RoleService;
import com.reflectionwebdesign.cybersomm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
        if(loginError) {
            model.addAttribute("loginError", "Email or Password invalid");
        }
        if(noUser) {
            model.addAttribute("noUser", "Please Login to access User Pages");
        }
        return "login";
    }

    @GetMapping("/loginSuccess")
    public String loginSuccess(Model model, Principal principal)
    {
        String name = principal.getName();
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
        Role role = roleService.findRoleById(2);
        Set<Role> roles = new HashSet<Role>();
        roles.add(role);
        user.setRoles(roles);
        userService.encodePassword(user);
        userService.save(user);
        return "registerSuccess";
    }

    @GetMapping("/user/accountHome")
    public String accountHome(Model model, Principal principal) {
        User currentUser = userService.findUserByUsername(principal.getName());
        model.addAttribute("currentUser", currentUser);
        return "/user/accountHome";
    }
}
