package zguru.springframework.zdependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import zguru.springframework.zdependencyinjection.services.GreetingService;

@Controller
public class ConstructorInjectedController {
    //Constructor injected is the most preferred way of DI.
    private final GreetingService greetingService;

    //The Autowired annotation is not required when using a Constructor for DI, Spring will automatically detect it.
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
