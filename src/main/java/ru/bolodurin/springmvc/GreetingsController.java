package ru.bolodurin.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingsController {

    @GetMapping("/hello")
    public String greetings(){
        return "hello";
    }
}
