/**
 * This class represents the main entry point for the API Gateway application.
 * It initializes and starts the Spring Boot application.
 *
 * @author Gaurav Joshi
 * @since January 30, 2024
 */
package com.tekgrp.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
