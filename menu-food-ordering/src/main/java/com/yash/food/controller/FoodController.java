package com.yash.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.yash.food.dao.FoodDaoImpl;
import com.yash.food.model.Food;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class FoodController {

    @Autowired
    FoodDaoImpl foodDao;

    @RequestMapping(value = "/menu")
    public List<Food> getMenu(Model model) {
        List<Food> foodItems ;
        foodItems = foodDao.getFoodList();
        return foodItems;
    }


}
