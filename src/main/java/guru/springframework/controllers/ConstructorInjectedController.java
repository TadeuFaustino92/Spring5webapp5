package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller                                             // para o caso da dependência no constructor eu não preciso usar o @Autowired
public class ConstructorInjectedController {

    private GreetingService greetingService;            // usando a interface, qualquer classe que implementar a interface será injetada aqui

    // @Autowired                                          opcional para esse contexto, depois de usar o qualifier não e mais necessário
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {    // para o construtor o qualifier deve ser usado a nível de método
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
