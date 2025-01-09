package dev.ranuka.full_stack_development;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FullStackDevelopmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(FullStackDevelopmentApplication.class, args);
    }

}
