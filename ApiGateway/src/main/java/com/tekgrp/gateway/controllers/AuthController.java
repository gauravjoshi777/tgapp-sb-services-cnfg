package com.tekgrp.gateway.controllers;

import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tekgrp.gateway.models.AuthResponse;

@RestController
@RequestMapping("/auth")
public class AuthController {
    
    private Logger logger = LoggerFactory.getLogger(AuthController.class);

    /**
     * Handles the login request and returns the authentication response.
     *
     * @param client The OAuth2 authorized client.
     * @param user The OIDC user.
     * @param model The model for the view.
     * @return The ResponseEntity containing the authentication response.
     */
    @GetMapping("/login")
    public ResponseEntity<AuthResponse> login(
            @RegisteredOAuth2AuthorizedClient("okta") OAuth2AuthorizedClient client,
            @AuthenticationPrincipal OidcUser user, Model model
    ){

        logger.info("user email id : {}", user.getEmail());

        AuthResponse authResponse = new AuthResponse();

        authResponse.setUserId(user.getEmail());

        authResponse.setAccessToken(client.getAccessToken().getTokenValue());

        authResponse.setRefreshToken(client.getRefreshToken().getTokenValue());

        authResponse.setExpireAt(client.getAccessToken().getExpiresAt().getEpochSecond());

       List<String> authorities = user.getAuthorities().stream().map(grantedAuthority -> {
            return grantedAuthority.getAuthority();
        }).collect(Collectors.toList());

        authResponse.setAuthorities(authorities);

        return new ResponseEntity<>(authResponse, HttpStatus.OK); 
    }

}
