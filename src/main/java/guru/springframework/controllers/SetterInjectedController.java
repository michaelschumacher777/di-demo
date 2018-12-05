package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello() {
        return this.getClass().getSimpleName() + " " + greetingService.sayGreeting();
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
