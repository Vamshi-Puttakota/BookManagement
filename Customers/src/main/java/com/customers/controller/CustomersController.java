package com.customers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customers.dto.AuthRequest;
import com.customers.entities.Customers;
import com.customers.services.CustomerService;

@RestController
@RequestMapping("/customer-service")
public class CustomersController {

	@Autowired
	CustomerService customerService;

	@PostMapping("/register")
	public String addCustomer(@RequestBody Customers customer) {
		return customerService.addCustomers(customer);
	}

	@GetMapping("/getinfo")
	public Customers getCustomerDetails(@RequestHeader("userInfo")  String phn) {
		return customerService.getCustomerDetailsByPhone(phn);
		
	}
	@PostMapping("/login")
	public String logIn(@RequestBody AuthRequest customer) {
		return customerService.logIn(customer);
	}
	
	
}
