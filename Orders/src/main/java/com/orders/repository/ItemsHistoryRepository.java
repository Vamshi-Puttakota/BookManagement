package com.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orders.entities.ItemsHistory;

public interface ItemsHistoryRepository extends JpaRepository<ItemsHistory, Integer>{

}
