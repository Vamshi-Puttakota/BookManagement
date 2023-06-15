package com.orderzzz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderzzz.entities.Orderzzz;
import com.orderzzz.service.OrderzzzService;

@RestController
@RequestMapping("/orderzzz-service")
public class OrderzzzController {

	@Autowired
	private OrderzzzService orderzzzService;
	
	@PostMapping("/add")
	public String addOrderzzz(@RequestBody Orderzzz orderzzz)
	{
		orderzzzService.addOrderzzz(orderzzz);
		return "Order added";
	}
	
	@GetMapping("/all-orders")
	public List<Orderzzz> getOrderzzzByCustomerId(@RequestHeader("userInfo") String cid)
	{
		return orderzzzService.getOrderzzzByCustomerId(cid);
	}
	
	
	@GetMapping("/get-order/{oid}")
	public Orderzzz getOrderzzzById(@PathVariable String oid)
	{
		return orderzzzService.getOrderzzzById(oid);
	}
	
	
	@GetMapping
	public List<Orderzzz> getAllOrderzzz()
	{
		return orderzzzService.getAllOrderzzz();
	}
	
	@GetMapping("/confirm-order")
	public Orderzzz addOrderByMethod(@RequestHeader("userInfo") String cust)
	{
		return orderzzzService.addOrderByMethod(cust);
	}


}