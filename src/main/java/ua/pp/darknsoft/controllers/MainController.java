package ua.pp.darknsoft.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {

        return "index";
    }

    @GetMapping("/admin")
    public String admin() {

        return "admin";
    }
}
