/**
 * This class represents the main entry point of the Service Registry application.
 * It enables the Eureka server and starts the Spring Boot application.
 * 
 * @author Gaurav Joshi
 * @since 2024-01-30
 */
package com.tekgrp.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

}
