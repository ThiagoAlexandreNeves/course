package com.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.entities.Order;
import com.course.repositories.OrderRepository;

@Service
public class OrderService {	
	
	final OrderRepository repository;
	
	@Autowired
	public OrderService(OrderRepository repository) {
		this.repository = repository;
	}
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
