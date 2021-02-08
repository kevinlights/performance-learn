package com.gjh.learn.springboot.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * created on 2021/2/8
 *
 * @author kevinlights
 */
@SpringBootApplication
@EnableAdminServer
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
