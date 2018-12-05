package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return this.getClass().getSimpleName() + " " + greetingService.sayGreeting();
    }

}
