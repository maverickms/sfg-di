package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    String message = "Constructor";

    @Override
    public String sayGreeting() {
        return "Hello World! " + message;
    }
}
