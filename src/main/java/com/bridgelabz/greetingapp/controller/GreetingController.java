package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.model.User;
import com.bridgelabz.greetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private IGreetingService greetingService;

    @GetMapping(value= {"", "/","/create"})
    public Greeting greeting(@RequestParam(value="name",defaultValue = "World") String name) {
        User user = new User();
        user.setFirstName(name);
        return greetingService.addGreeting(user);

    }

    @GetMapping("/getbyid/{id}")
    public Greeting findGreetingById(@PathVariable long id) {

        return greetingService.getGreetingById(id);
    }

    @GetMapping("/getall")
    public List<Greeting> getAllGreetings() {

        return greetingService.getAllGreetings();
    }

    @PutMapping("/update")
    public Greeting editGreeting(Greeting greeting) {

        return greetingService.editGreeting(greeting);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMessageById(@PathVariable long id) {

        return this.greetingService.deleteMessageById(id);
    }
}
