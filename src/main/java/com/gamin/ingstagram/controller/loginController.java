package com.gamin.ingstagram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {

    @GetMapping("/feed")
    public String feed() {
        return "feed";
    }
}
