package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller                                             // anotado como controller faz a classe ser gerenciada como spring bean
public class PropertyInjectedController {

    @Autowired                                          // pode evitar NPEs
    @Qualifier("greetingServiceImpl")
    public GreetingServiceImpl greetingService;         // public property

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

