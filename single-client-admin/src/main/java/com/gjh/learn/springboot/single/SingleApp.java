package com.gjh.learn.springboot.single;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created on 2021/2/8
 *
 * @author kevinlights
 */
@SpringBootApplication
@RestController
@EnableAdminServer
public class SingleApp {
    public static void main(String[] args) {
        SpringApplication.run(SingleApp.class, args);
    }

    @GetMapping(value = "/")
    public String index() {
        return "Hello";
    }
}
