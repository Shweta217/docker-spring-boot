package com.docker.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
public class DockerSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerSpringBootApplication.class, args);
    }


}
