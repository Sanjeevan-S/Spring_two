package com.springboot.two.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.two.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmailAndMobNo(String email, String mobNo);
}
