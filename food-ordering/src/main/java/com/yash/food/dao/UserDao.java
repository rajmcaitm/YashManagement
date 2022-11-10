package com.yash.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.food.model.User;

public interface UserDao extends JpaRepository<User,String> {
}
