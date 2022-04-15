package com.lazzo.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

@SpringBootApplication
public class ProjectApplication extends WebMvcAutoConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }

}
