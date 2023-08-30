package org.example.springboot.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MainApp {

    private final Logger logger = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MainApp.class, args);
    }

    @EventListener(ContextRefreshedEvent.class)
    public void contextRefreshed() {
        logger.info("Context refreshed..........");
    }
    @EventListener(ContextClosedEvent.class)
    public void contextClosed() {
        logger.info("Context closed..........");
    }
}
