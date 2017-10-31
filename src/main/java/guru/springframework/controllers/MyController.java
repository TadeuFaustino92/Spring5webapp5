package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller                     // por estar marcado como componente/spring bean, será criado uma instância do componente e colocado no contexto do spring
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello!!");

        return greetingService.sayGreeting();
    }
}
