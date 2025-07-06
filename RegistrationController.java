package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "register";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute Student student) {
        System.out.println("Registration Number: " + student.getRegNo());
        System.out.println("Name: " + student.getName());
        System.out.println("Branch: " + student.getBranch());
        return "register";
    }
}

