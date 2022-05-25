package com.example.ztattom.controllers;

import com.example.ztattom.entities.User;
import com.example.ztattom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @Autowired
    private UserRepository userRepo;


    @GetMapping("")
    public String getHome()
    {
        return "index";
    }
    @GetMapping("/register")
    public String getRegister(Model model)
    {
        model.addAttribute("user", new User());
        return "registration";
    }
    @PostMapping("/register_process")
    public String processRegistration(User user)
    {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepo.save(user);
        return "user_page";
    }

}
