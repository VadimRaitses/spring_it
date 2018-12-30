package com.bakman.spring_it;

import org.ocpsoft.prettytime.PrettyTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.extras.springsecurity5.dialect.SpringSecurityDialect;

@SpringBootApplication
//@EnableJpaAuditing
//@EnableConfigurationProperties(SprintItProperties.class)
public class SpringItApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringItApplication.class, args);
    }

    @Bean
    PrettyTime getPrettyTime() {
        return new PrettyTime();
    }

    // TODO * Configuring this bean should not be needed once Spring Boot's Thymeleaf starter includes configuration
// TODO   for thymeleaf-extras-springsecurity5 (instead of thymeleaf-extras-springsecurity4)
    @Bean
    public SpringSecurityDialect securityDialect() {
        return new SpringSecurityDialect();
    }
}

