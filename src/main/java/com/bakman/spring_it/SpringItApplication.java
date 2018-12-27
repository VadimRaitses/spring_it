package com.bakman.spring_it;

import com.bakman.spring_it.domain.Comment;
import com.bakman.spring_it.domain.Link;
import com.bakman.spring_it.repository.CommentRepository;
import com.bakman.spring_it.repository.LinkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
//@EnableConfigurationProperties(SprintItProperties.class)
public class SpringItApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringItApplication.class);

//    @Autowired
//    private SprintItProperties sprintItProperties;

    public static void main(String[] args) {
        SpringApplication.run(SpringItApplication.class, args);
    }

    
//    @Bean
//    @Profile("dev")
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
        return args -> {
            Link link = new Link("getting started with spring boot 2", "https://therealdanvega.com/spring-boot-2-docs");
            linkRepository.save(link);

            Comment comment = new Comment("This link is da shiiiiiit", link);
            commentRepository.save(comment);

            link.addComment(comment);

            System.out.println("added a link and a comment: " + link + " " + link.getComments());
        };
    }

}

