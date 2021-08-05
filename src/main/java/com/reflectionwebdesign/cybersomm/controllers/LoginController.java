package com.reflectionwebdesign.cybersomm.controllers;

import com.reflectionwebdesign.cybersomm.models.User;
import com.reflectionwebdesign.cybersomm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class LoginController {

    private UserService userService;

    @Autowired public  LoginController (UserService userService){
        this.userService = userService;
    }

    @ModelAttribute("user")
    public User user() {
        return new User();
    }

    @GetMapping("/login")
    String login() {
        return "login";
    }

    @PostMapping("/login")
    public String submitForm(@Valid @ModelAttribute("user") User user, Model model, BindingResult bindingResult) {
        User validate = userService.findUserByEmail(user.getEmail());
        if (bindingResult.hasErrors()) {
            return "login";
        } else if(validate == null) {
            model.addAttribute("notRegister", "User not registered, please make an account");
            return "login";
        } else if (!validate.getPassword().equals(user.getPassword())) {
            model.addAttribute("invalid", "Invalid password");
            return "login";
        }
        model.addAttribute("valid", validate);
        return "loginSuccess";
    }
}
