package com.cart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cart.entities.Cart;

public interface CartRepository extends JpaRepository<Cart, String> {

	
	Cart findByCustomerId(String cid);
}
