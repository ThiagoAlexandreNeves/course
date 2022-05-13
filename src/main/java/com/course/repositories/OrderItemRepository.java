package com.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.entities.OrderItem;

@Repository
public interface OrderItemRepository  extends JpaRepository<OrderItem, Long> {
	
}
