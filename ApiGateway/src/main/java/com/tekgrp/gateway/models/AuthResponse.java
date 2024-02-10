/**
 * Represents the authentication response.
 * Contains information about the user, access token, refresh token, expiration time, and authorities.
 * 
 * @author Gaurav Joshi
 * @since January 30, 2024
 */
package com.tekgrp.gateway.models;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    
    private String userId;

    private String accessToken;
    
    private String refreshToken;
    
    private long expireAt;

    private Collection<String> authorities;
    
}
