package com.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cart.entities.Items;

public interface ItemsRepository extends JpaRepository<Items, Integer> {

}
