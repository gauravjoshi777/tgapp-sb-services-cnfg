// package com.tekgrp.gateway.config;

// import org.hibernate.validator.internal.util.logging.Log_.logger;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
// import org.springframework.security.config.web.server.ServerHttpSecurity;
// import org.springframework.security.web.server.SecurityWebFilterChain;

// import com.tekgrp.gateway.controllers.AuthController;

// @Configuration
// @EnableWebFluxSecurity
// public class SecurityConfig {
//  private Logger logger = LoggerFactory.getLogger(AuthController.class);
//     @Bean
//     public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity httpSecurity){
//         logger.info("Inside securityWebFilterChain!!!!!!!");
//         httpSecurity
//             .authorizeExchange()
//             .anyExchange()
//             .authenticated()
//             .and()
//             .oauth2Client()
//             .and()
//             .oauth2ResourceServer()
//             .jwt();

//             return httpSecurity.build();

//     }
// }

