package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.customer;

@Repository

public interface customer_repository extends CrudRepository<customer, Integer>{

	
	
}
