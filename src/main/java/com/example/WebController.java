package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by existmaster on 2016. 6. 7..
 */
@RestController
@RequestMapping(value = "people")
public class WebController {

    @Autowired
    PersonRepository personRepository;


    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping(method = RequestMethod.POST)
    public Person personInput(@RequestBody Person person){
        Person result = personRepository.save(person);

        return result;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Person> person(){
         Iterable<Person> result = personRepository.findAll();

        return result;
    }

    @RequestMapping(value="/search", method = RequestMethod.GET)
    public Iterable<Person> personSearch(@RequestParam("name") String name){
        Iterable<Person> result = personRepository.findByName(name);
        return result;

    }

}
