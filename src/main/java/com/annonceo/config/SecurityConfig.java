package com.annonceo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable() // Désactiver CSRF pour simplifier les tests avec Postman
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/users/**", "/api/messages/**", "/api/payments/**").permitAll() // Autorise l'accès public aux endpoints spécifiés
                .anyRequest().authenticated() // Requiert une authentification pour tous les autres endpoints
            );

        return http.build();
    }
}
