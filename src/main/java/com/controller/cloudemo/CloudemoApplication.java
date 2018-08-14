package com.controller.cloudemo;

import com.netflix.discovery.EurekaClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudemoApplication {

	public static void main(String[] args) {
		System.out.println("111");
		SpringApplication.run(CloudemoApplication.class, args);
	}
}
