package com.example.finalProject.Controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WomanClothController {
    @GetMapping("/woman")
    public String woman_cloth() {
        return "woman_cloth";
    }

    @GetMapping("/jacket")
    public String jacket1() {
        return "woman_jacket";
    }
}

