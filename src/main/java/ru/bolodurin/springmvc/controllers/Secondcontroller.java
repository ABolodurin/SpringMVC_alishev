package ru.bolodurin.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second")

public class Secondcontroller {
    @GetMapping("/exit")
    public String exitPage(){
        return "second/exit";
    }
}
