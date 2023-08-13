package com.example.JwtAuthService.controller;

import com.example.JwtAuthService.dto.JwtRequest;
import com.example.JwtAuthService.dto.RegistrationUserDto;
import com.example.JwtAuthService.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/auth")
    public ResponseEntity<?> createAuthToken(@RequestBody JwtRequest authRequest) {
        return authService.createAuthToken(authRequest);
    }


}
