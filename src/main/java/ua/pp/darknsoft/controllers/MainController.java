package ua.pp.darknsoft.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        System.out.println("We are in the index method from " + this.getClass());
        return "index";
    }
}
