package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service                                                                // por ser um serviço também é um spring component
public class GreetingServiceImpl implements GreetingService{            // o serviço implementa a interface

    public static final String HELLO_GURUS = "Hello Gurus!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
