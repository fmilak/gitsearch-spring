package com.fmilak.gitsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class GitsearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitsearchApplication.class, args);
    }

}
