package com.daily.dailymark_backend.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AppRunner implements ApplicationRunner {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    private final Environment environment;

    @Autowired
    public AppRunner(Environment environment) {
        this.environment = environment;
    }

    @Override
    public void run(ApplicationArguments args) {
        logger.info("===================Profiles Test ===================");
        logger.info("Active profiles : "+ Arrays.toString(environment.getActiveProfiles()));
        logger.info("Datasource url : " + environment.getProperty("spring.datasource.url"));
        logger.info("Datasource username : " + environment.getProperty("spring.datasource.username"));
        logger.info("Datasource password : " + environment.getProperty("spring.datasource.password"));
        logger.info("Server Port : " + environment.getProperty("server.port"));
        logger.info("====================================================");
    }
}