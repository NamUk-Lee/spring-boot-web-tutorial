package com.example.service;

import com.example.domain.Person;

public class PersonService {

    public String sayHello(Person p){
        return p.getName() + " Hello!";
    }

}
