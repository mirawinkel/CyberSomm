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
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class RegisterController {

    private UserService userService;

    @Autowired
    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("user")
    public User user() {
        return new User();
    }

    @GetMapping("/register")
    String register() {
        return "register";
    }

    @PostMapping("/register")
    //
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
        userService.save(user);
        return "success";
    }
}
