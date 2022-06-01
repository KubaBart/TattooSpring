package com.example.ztattom.controllers;

import com.example.ztattom.entities.Role;
import com.example.ztattom.entities.User;
import com.example.ztattom.repository.UserRepository;
import com.example.ztattom.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RegistrationController {

    @Autowired
    private UserService usrService;
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
        List<Role> listRoles = usrService.getRoles();
        model.addAttribute("user", new User());
        model.addAttribute("listRoles", listRoles);
        return "registration";
    }
    @PostMapping("/register_process")
    public String processRegistration(User user)
    {
        usrService.saveUserWithRole(user);
        return "user_page";
    }

}
