package zguru.springframework.zdependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import zguru.springframework.zdependencyinjection.services.GreetingService;

@Controller     //If we don't annotate this controller here, spring would not know this is a managed component.
public class PropertyInjectedController {
    //Least preferred method of DI
    @Qualifier("propertyInjectedGreetingService")
    @Autowired //null pointer exception is thrown because Spring does not know to create and inject an instance of greeting service.
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
