package org.vizuri.quarkus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/hello")
public class GreetingResource {

    @GetMapping
    public Person hello() {
        Person p = new Person();
        p.setFirstName("Fred");
        p.setLastName("Flintstone");
        p.setId(1);
        return p;
    }
}