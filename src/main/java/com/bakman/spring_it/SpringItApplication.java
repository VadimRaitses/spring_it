package com.bakman.spring_it;

import org.ocpsoft.prettytime.PrettyTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
//@EnableConfigurationProperties(SprintItProperties.class)
public class SpringItApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringItApplication.class, args);
    }

    @Bean
    PrettyTime getPrettyTime() {
        return new PrettyTime();
    }
}

