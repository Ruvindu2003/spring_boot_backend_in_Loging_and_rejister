package com.example.RejisterLogin.controller;

import com.example.RejisterLogin.entity.Userentity;
import com.example.RejisterLogin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String viewHomePage() {
        return "index";
    }

    @GetMapping("/register")
    public String showSignupForm(Model model) {
        model.addAttribute("user", new Userentity());
        return "signup_form";
    }

    @PostMapping("/register")
    public String processRegister(@ModelAttribute("user") Userentity user) {
        userService.registerUser(user);
        return "register_success";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login_form";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String email, @RequestParam String password, Model model) {
        Userentity user = userService.loginUser(email, password);
        if (user != null) {
            model.addAttribute("user", user);
            return "dashboard";
        } else {
            model.addAttribute("error", "Invalid email or password");
            return "login_form";
        }
    }
}
