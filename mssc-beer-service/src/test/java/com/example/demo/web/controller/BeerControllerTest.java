package com.example.demo.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springframework.msscbeerservice.web.controller.BeerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import java.util.UUID;

/**
 * @author Chandra
 */

@WebMvcTest(BeerController.class)
public class BeerControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    void getBeerById()throws Exception{
      //  mockMvc.perform(get("/api/v1/beer/"+ UUID.randomUUID().toString());
    }



}
