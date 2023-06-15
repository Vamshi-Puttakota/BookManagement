package com.customers.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.customers.dao.CustomerRepository;
import com.customers.dto.AuthRequest;
import com.customers.dto.UserCredential;
import com.customers.entities.Customers;

import com.customers.exceptions.CustomerNotFoundException;
import com.customers.exceptions.GlobalExceptionHandler;
import com.customers.exceptions.InvalidCredentialsException;
import com.customers.exceptions.UserExsistsException;
import com.customers.external.JwtClient;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private JwtClient jwt;

	public Customers getCustomerDetailsByPhone(@RequestHeader("customerId") String phn) {
		return customerRepository.findById(phn)
				.orElseThrow(() -> new CustomerNotFoundException("No customer found with the phn: " + phn));

		// return customerRepository.findByCustomer_phone(phn);
	}

	public String addCustomers(Customers customer) {

		try {

			Customers cust = customerRepository.findById(customer.getCustomerPhone()).get();

			if (cust != null)
				throw new UserExsistsException();

		} catch (UserExsistsException ex) {
			return "User is already registered";
		} catch (Exception e) {
			customerRepository.save(customer);

			// Login login = new Login();
			UserCredential user = new UserCredential();
			user.setEmail(customer.getCustomerName());
			user.setName(customer.getCustomerPhone());
			user.setPassword(customer.getCustomerPassword());
			jwt.addNewUser(user);
			return customer.getCustomerName() + " is registered as a user";

		}

		return "hiii";
	}

	public String logIn(AuthRequest customer) {

		try {
		return jwt.getToken(customer);
		}
		catch (Exception e) {
			throw new InvalidCredentialsException(); 
		}

	}

}