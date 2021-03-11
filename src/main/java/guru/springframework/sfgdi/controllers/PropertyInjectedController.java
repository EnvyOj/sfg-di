package guru.springframework.sfgdi.controllers;

import services.GreetingsService;

public class PropertyInjectedController {

    public GreetingsService greetingsService;

    public String getGreeting(){
        return greetingsService.sayGreetings();
    }
}
