package com.bakman.spring_it.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2) //orders the component to be the second to run
public class DatabaseLoader implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        //do some DB work
        System.out.println("DB Loader...");
    }
}
