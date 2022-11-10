package com.yash.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.food.model.Food;


public interface FoodDao extends JpaRepository<Food,String> {

}
