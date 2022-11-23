package ru.bolodurin.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FirstController {
    @GetMapping("/")
    public String helloPage(@RequestParam (value = "name", required = false) String name,
                            @RequestParam (value = "surname", required = false) String surname) {
        System.out.printf("Fuck you, %s %s.%n", name, surname);
        return "first/hello";
    }

    @GetMapping("/bye")
    public String byePage() {
        return "first/bye";
    }
}
