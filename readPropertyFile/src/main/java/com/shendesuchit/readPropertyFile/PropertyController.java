package com.shendesuchit.readPropertyFile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyController {

    @Autowired
    Configuration configuration;

    @GetMapping("/name")
    public String getFullName() {

        String name = configuration.getFirstName() + " " + configuration.getLastName();
        return name;
    }

}
