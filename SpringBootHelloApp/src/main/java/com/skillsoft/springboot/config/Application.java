package com.skillsoft.springboot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.skillsoft.springboot.persistence.repo")
@EntityScan("com.skillsoft.springboot.persistence.model")
@SpringBootApplication(scanBasePackages = {"com.skillsoft.springboot.controller"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
