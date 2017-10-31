package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service                                                            // essa anotação também faz com que o spring context traga a classe/objeto como um spring bean
@Primary
@Profile({"en", "default"})                                         // profile default só fica ativo quando não tem outro profile ativo em app.properties
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - Primary Greeting Service";
    }
}
