package com.company.pethospital.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String welcomeMessage() {
        return "pet-hospital-management-system-api";
    }
}
