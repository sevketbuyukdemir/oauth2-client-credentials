package com.sevketbuyukdemir.client_application.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Profile("!prod")
@Configuration
@EnableWebSecurity
public class DevSecurityConfig {}
