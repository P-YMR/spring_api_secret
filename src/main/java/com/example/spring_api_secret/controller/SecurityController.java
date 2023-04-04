package com.example.spring_api_secret.controller;

import com.example.spring_api_secret.dto.AuthorizeResponse;
import com.example.spring_api_secret.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/security")
public class SecurityController {

    @Autowired
    private SecurityService service;

    @GetMapping("/info")
    public Map<String, String> info() {
        return service.info();
    }

    @GetMapping("/authorizer")
    public AuthorizeResponse token() {
        return service.token();
    }
}
