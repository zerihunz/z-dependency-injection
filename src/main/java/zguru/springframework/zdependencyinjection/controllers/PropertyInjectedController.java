package zguru.springframework.zdependencyinjection.controllers;

import zguru.springframework.zdependencyinjection.services.GreetingService;

public class PropertyInjectedController {
    //Least preferred method of DI
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
