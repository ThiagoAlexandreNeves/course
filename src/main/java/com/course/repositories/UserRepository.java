package com.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{
	
}
