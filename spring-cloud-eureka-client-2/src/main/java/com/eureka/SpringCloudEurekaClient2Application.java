package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudEurekaClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaClient2Application.class, args);
    }

    @RestController
    class EurekaClientController {

        @GetMapping("/eureka/client")
        public String eurekaClient() {
            return "eureka client - 2";
        }
    }
}
