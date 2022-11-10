package com.yash.food;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yash.food.dao.CartDaoImpl;
import com.yash.food.dao.FoodDaoImpl;
import com.yash.food.model.Cart;
import com.yash.food.model.Food;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoodOrderingApplicationTests {

    @Autowired
    FoodDaoImpl foodDao;

    @Autowired
    CartDaoImpl cartDao;

    
    @Test
    public void checkFoodTable(){
        Food food = new Food();
        food.setId("abc");
        Food food1 = foodDao.validateFoodInfo(food.getId());
        Assert.assertEquals("Coffee",food1.getItem());
        Assert.assertEquals(50,food1.getPrice());
    }

    @Test
    public void checkCartDb(){
        List<Cart> carts = cartDao.getAllCart();
        Cart zero = carts.get(0);
        Assert.assertEquals(0,zero.getQuantity1());
        Assert.assertEquals(0,zero.getQuantity2());
        Assert.assertEquals(0,zero.getQuantity3());
    }

    /*Test*/


}
