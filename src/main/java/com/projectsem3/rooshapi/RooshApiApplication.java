package com.projectsem3.rooshapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EntityScan("com.projectsem3.rooshapi.*")
@ComponentScan("com.projectsem3.rooshapi.*")
@ComponentScan("com.projectsem3.rooshapi.mapper")
@ComponentScan(basePackages = { "com.projectsem3.rooshapi.repositories.entity" })
@EnableJpaRepositories(basePackages = {"com.projectsem3.rooshapi.data"})
public class RooshApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(RooshApiApplication.class, args);
    }

}
