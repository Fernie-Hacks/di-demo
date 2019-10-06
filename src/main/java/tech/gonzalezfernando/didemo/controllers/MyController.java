package tech.gonzalezfernando.didemo.controllers;

import org.springframework.stereotype.Controller;
import tech.gonzalezfernando.didemo.services.GreetingService;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello World!");

        return greetingService.sayGreeting();
    }
}
