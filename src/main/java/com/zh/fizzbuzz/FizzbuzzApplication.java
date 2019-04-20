package com.zh.fizzbuzz;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzbuzzApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(FizzbuzzApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run();
    }
}
