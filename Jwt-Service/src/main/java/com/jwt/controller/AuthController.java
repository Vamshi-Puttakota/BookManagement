package com.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import com.jwt.dto.AuthRequest;
import com.jwt.entity.UserCredential;
import com.jwt.servcie.AuthService;

@RestController
@RequestMapping("/authentication")
public class AuthController {
	@Autowired
	private AuthService service;

	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("/register")
	public String addNewUser(@RequestBody UserCredential user) {
		return service.saveUser(user);
	}

	@PostMapping("/generattoken")
	public String getToken(@RequestBody AuthRequest authRequest) {
		
		return service.generateToken(authRequest);
		
	}

	@GetMapping("/validate")
	public String validateToken(@RequestParam("token") String token) {
		service.validateToken(token);
		return "Token is valid";
	}
}