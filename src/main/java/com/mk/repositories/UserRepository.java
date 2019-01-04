package com.mk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mk.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUserName(String userName);
}
