package com.example.tacocloud;


import com.example.tacocloud.Controller.HomeController;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static java.nio.file.Paths.get;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@WebMvcTest(HomeController.class)
public class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHomePage() throws Exception {

       mockMvc.perform((RequestBuilder) get("/"))
               .andExpect(status().isOk())
               .andExpect(view().name("home"))
               .andExpect(content().string(
                       containsString("Welcome to....")
               ));
    }
}
