package com.bakman.spring_it;

import com.bakman.spring_it.config.SprintItProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableConfigurationProperties(SprintItProperties.class)
public class SpringItApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringItApplication.class);

    @Autowired
    private SprintItProperties sprintItProperties;

    public static void main(String[] args) {
        SpringApplication.run(SpringItApplication.class, args);
    }

    @Bean
    @Profile("dev")
    CommandLineRunner runner() {
        return args -> System.out.println("Welcome MSG: " + sprintItProperties.getWelcome());
    }
}

