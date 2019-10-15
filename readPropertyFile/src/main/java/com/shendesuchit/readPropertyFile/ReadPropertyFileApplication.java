package com.shendesuchit.readPropertyFile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ReadPropertyFileApplication {

    @Autowired
    private static Configuration configuration;

    public static void main(String[] args) {
        SpringApplication.run(ReadPropertyFileApplication.class, args);
    }

}
