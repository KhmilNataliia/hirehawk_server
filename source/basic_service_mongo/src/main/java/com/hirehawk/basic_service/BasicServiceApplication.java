package com.hirehawk.basic_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories(basePackages = {"com.hirehawk.basic_service.testmongo"})
public class BasicServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicServiceApplication.class, args);
    }

}
