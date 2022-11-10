package com.yash.food;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yash.food.controller.CartController;
import com.yash.food.controller.FoodController;
import com.yash.food.dao.CartDaoImpl;
import com.yash.food.dao.FoodDaoImpl;

@RunWith(SpringRunner.class)
@WebMvcTest({FoodController.class, CartController.class})
public class ApiTests {
    @Autowired
    private MockMvc mvc;

    @MockBean
    FoodDaoImpl foodDao;

    @MockBean
    CartDaoImpl cartDao;

    /*@Test
    public void postLoginAPI() throws Exception
    {
        mvc.perform( MockMvcRequestBuilders
                .post("/login")
                .content(asJsonString(new Login("amank","abcd1234")))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
*/
    @Test
    public void getMenuApi() throws Exception{
        mvc.perform(MockMvcRequestBuilders
                .get("/menu")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }

    /*@Test
    public void getTotalCartApi() throws Exception{
        mvc.perform( MockMvcRequestBuilders
                .post("/cart")
                .content(asJsonString(new Cart(1,1,1,1,1,1)))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }*/

    @Test
    public void getChangeDBCartApi() throws Exception{
        mvc.perform(MockMvcRequestBuilders
                .get("/changeDB")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }

    public static String asJsonString(final Object obj) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            final String jsonContent = mapper.writeValueAsString(obj);
            return jsonContent;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
