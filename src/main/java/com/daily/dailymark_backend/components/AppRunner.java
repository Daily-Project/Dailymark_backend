package com.daily.dailymark_backend.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
public class AppRunner implements ApplicationRunner {

    private final Environment environment;

    @Autowired
    public AppRunner(Environment environment) {
        this.environment = environment;
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("===================Profiles Test ===================");
        System.out.println("Active profiles : "+ Arrays.toString(environment.getActiveProfiles()));
        System.out.println("Datasource url : " + environment.getProperty("spring.datasource.url"));
        System.out.println("Datasource username : " + environment.getProperty("spring.datasource.username"));
        System.out.println("Datasource password : " + environment.getProperty("spring.datasource.password"));
        System.out.println("Server Port : " + environment.getProperty("server.port"));
        System.out.println("====================================================");
    }
}