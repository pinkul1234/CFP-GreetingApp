package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
    List<Greeting> getAllGreetings();
    Greeting editGreeting(Greeting greeting);
    String deleteMessageById(long id);
}
