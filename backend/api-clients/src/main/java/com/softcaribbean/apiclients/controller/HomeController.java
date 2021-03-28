package com.softcaribbean.apiclients.controller;

import com.softcaribbean.apiclients.models.entity.Client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "Home controller";
    }

    @GetMapping("/json")
    public Client json(){
        Client client = new Client();
        client.getBirthDay();

        return client;
    }
    
}
