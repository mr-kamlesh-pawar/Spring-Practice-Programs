package com.kp.springboot_jpa_01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "Welcome to the dashboard!";
    }

     @GetMapping("/user/dashboard")
    public String userDashboard() {
        return "Welcome to the dashboard!";
    }
}