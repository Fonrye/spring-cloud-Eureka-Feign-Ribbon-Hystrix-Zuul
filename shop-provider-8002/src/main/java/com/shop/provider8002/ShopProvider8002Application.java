package com.shop.provider8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ShopProvider8002Application {

    public static void main(String[] args) {
        SpringApplication.run(ShopProvider8002Application.class, args);
    }


}
