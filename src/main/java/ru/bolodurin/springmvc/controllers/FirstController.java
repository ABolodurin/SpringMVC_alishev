package ru.bolodurin.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/")
    public String helloPage(){
        return "first/hello";
    }

    @GetMapping("/bye")
    public String byePage(){
        return "first/bye";
    }
}
