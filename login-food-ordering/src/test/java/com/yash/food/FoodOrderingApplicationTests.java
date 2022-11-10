package com.yash.food;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yash.food.dao.UserDao;
import com.yash.food.dao.UserDaoImpl;
import com.yash.food.model.Login;
import com.yash.food.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoodOrderingApplicationTests {

    @Autowired
    UserDao userDao;

    @Autowired
    UserDaoImpl userDaoImpl;

   @Test
    public void contextLoads() {
        Login login = new Login();
        login.setUsername("amank");
        login.setPassword("abcd1234");

        User user = userDaoImpl.validateUser(login);
        Assert.assertEquals("Aman",user.getFirstname());
        Assert.assertEquals("Kumar",user.getLastname());
        Assert.assertEquals("aman@gmail.com",user.getEmail());
        Assert.assertEquals(9585418,user.getPhone());
    }

    
}
