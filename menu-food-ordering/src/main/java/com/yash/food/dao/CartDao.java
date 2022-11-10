package com.yash.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.food.model.Cart;

public interface CartDao extends JpaRepository<Cart,Integer> {
}
