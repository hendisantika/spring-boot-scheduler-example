package com.hendisantika.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-scheduler-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/10/17
 * Time: 05.42
 * To change this template use File | Settings | File Templates.
 */
@SpringBootApplication
@EnableScheduling
public class Application implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);
    
    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... strings) throws Exception {
    	log.info("Look in application.yml for the  directory path. Files will be created every 30 seconds.");
    } 
}