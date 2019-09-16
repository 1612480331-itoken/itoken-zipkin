package com.example.itokenzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

@EnableZipkinServer
@EnableEurekaClient
@SpringBootApplication
public class ItokenZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItokenZipkinApplication.class, args);
    }

}
