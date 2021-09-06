package com.example.shoppingdataprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ShoppingDataProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingDataProviderApplication.class, args);
    }

}
