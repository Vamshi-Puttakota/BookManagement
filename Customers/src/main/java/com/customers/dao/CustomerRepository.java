package com.customers.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.customers.entities.Customers;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, String> {


}
