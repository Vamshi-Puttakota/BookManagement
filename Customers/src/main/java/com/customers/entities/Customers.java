package com.customers.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Customers {

	
	
	private String customerName;
	private String customerEmail;
	private String customerAddress;
	
	@Id
	private	String customerPhone;
	private String customerPassword;
	
}
