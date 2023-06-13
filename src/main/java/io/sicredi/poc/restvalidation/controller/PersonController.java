package io.sicredi.poc.restvalidation.controller;

import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/people")
@Validated
public class PersonController {

    @GetMapping
    public List<Person> get(@RequestParam @Size(min= 3) String city, @RequestParam @Size(min= 3) String country){
        return List.of(new Person("Henrique " + city + " " + country));
    }

}
