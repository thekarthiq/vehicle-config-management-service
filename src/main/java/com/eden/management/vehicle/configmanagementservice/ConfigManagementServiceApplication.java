package com.eden.management.vehicle.configmanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigManagementServiceApplication {
	//This service will mainly focus on providing the configuration to other services.
	public static void main(String[] args) {
		SpringApplication.run(ConfigManagementServiceApplication.class, args);
	}

}
