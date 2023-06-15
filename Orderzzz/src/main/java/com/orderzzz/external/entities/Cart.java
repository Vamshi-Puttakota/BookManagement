package com.orderzzz.external.entities;

import java.util.ArrayList;
import java.util.List;

import com.orderzzz.entities.OrderzzzItems;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @ NoArgsConstructor @AllArgsConstructor
public class Cart {

	private String customerId;
	private Integer totalPrice;
	private List<OrderzzzItems> items = new ArrayList<OrderzzzItems>();
}
	 
