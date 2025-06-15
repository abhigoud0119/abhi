package com.gymmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingController {

    @GetMapping("/")  // Root URL
    public String landingPage() {
        return "landing"; // Return landing.html
    }

    @GetMapping("/index")
    public String indexPage() {
        return "index";  // Return index.html
    }
}
