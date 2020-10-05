package zguru.springframework.zdependencyinjection.controllers;

import org.springframework.stereotype.Controller;
import zguru.springframework.zdependencyinjection.services.GreetingService;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
