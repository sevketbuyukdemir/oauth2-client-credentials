package com.sevketbuyukdemir.resource_server.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin-resources", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class AdminResourceController {

    @GetMapping("/first-resource")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> first(Authentication authentication, HttpServletRequest request) {
        return new ResponseEntity<>("FIRST ADMIN RESOURCE", HttpStatus.OK);
    }

    @GetMapping("/second-resource")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> second(Authentication authentication, HttpServletRequest request) {
        return new ResponseEntity<>("SECOND ADMIN RESOURCE", HttpStatus.OK);
    }
}