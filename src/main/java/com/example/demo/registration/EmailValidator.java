package com.example.demo.registration;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.function.Predicate;

@Component
public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String s) {
//        TODO: Regex to validate email
        return true;
    }
}
