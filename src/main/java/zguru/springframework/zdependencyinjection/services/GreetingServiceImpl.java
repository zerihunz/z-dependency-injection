package zguru.springframework.zdependencyinjection.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World!";
    }
}
