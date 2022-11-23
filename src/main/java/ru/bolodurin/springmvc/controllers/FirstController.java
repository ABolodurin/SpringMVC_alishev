package ru.bolodurin.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FirstController {
    @GetMapping("/")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {
        String message = String.format("Fuck you, %s %s.%n", name, surname);
        model.addAttribute("message", message);
        return "first/hello";
    }

    @GetMapping("/bye")
    public String byePage() {
        return "first/bye";
    }

    @GetMapping("/calc")
    public String helloPage(@RequestParam("a") int a,
                            @RequestParam("b") int b,
                            @RequestParam("action") String action,
                            Model model) {

        String message = "Result is ";
        switch (action) {
            case "addition":
                message += a + b;
                break;
            case "subtraction":
                message += a - b;
                break;
            case "multiplication":
                message += a * b;
                break;
            case "division":
                if (b == 0) {
                    message = "division by zero";
                } else message += (float) a / (float) b;
                break;
            default:
                message = "unknown action";
                break;
        }
        model.addAttribute("message", message);

            return "first/calc";
    }
}
