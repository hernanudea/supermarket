package dev.velasquez.supermarket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HelloWordController {

    @GetMapping("/hola")
    public String saludar() {
        return "Hola Mundo desde Spring 🚀";
    }
}