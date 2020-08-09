package com.nordic.springit;

import com.nordic.springit.domain.Comment;
import com.nordic.springit.domain.Link;
import com.nordic.springit.repository.CommentRepository;
import com.nordic.springit.repository.LinkRepository;
import org.apache.juli.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringitApplication {

    //private static final Logger log = LogFactory.getLog(SpringitApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository){
        return args ->{
            Link link = new Link("string boot 2", "https://www.yahoo.com");
            linkRepository.save(link);

            Comment comment = new Comment("awsome", link);
            commentRepository.save(comment);
            link.addComment(comment);

           //ystem.out.println(link.toString());
           // System.out.println(link.getComments());
        };
    }
}
