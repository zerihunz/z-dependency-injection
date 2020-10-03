package zguru.springframework.zdependencyinjection.controllers;

import zguru.springframework.zdependencyinjection.services.GreetingService;

public class ConstructorInjectedController {
    //Constructor injected is the most preferred way of DI.
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
