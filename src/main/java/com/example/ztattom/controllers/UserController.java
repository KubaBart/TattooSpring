package com.example.ztattom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/addTatDate")
    public String addTattooDate()
    {

        return "addTatDate";
    }

    @GetMapping("/tatRegister")
    public String addTattooReg()
    {

        return "tatuaz_reg";
    }

    @GetMapping("/user_page")
    public String userPage()
    {

        return "user_page";
    }

}
