package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
public class SpringBootConfigServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfigServerDemoApplication.class, args);
	}

}
