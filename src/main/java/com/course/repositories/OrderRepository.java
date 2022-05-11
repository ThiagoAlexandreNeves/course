package com.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.entities.Order;

@Repository
public interface OrderRepository  extends JpaRepository<Order, Long> {
	
}
