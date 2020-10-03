package zguru.springframework.zdependencyinjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import zguru.springframework.zdependencyinjection.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getString() {
        System.out.println(controller.getGreeting());
    }
}