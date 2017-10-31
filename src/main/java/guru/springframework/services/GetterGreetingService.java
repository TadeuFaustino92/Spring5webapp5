package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello - Eu fui injetado via getter";
    }
}
