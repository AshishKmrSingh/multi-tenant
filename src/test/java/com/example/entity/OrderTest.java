package com.example.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class OrderTest {

    private Order order;

    @BeforeEach
    public void setUp() {
        order = new Order();
    }

    @Test
    public void orderCreation_dateIsSet() {
        Date expectedDate = new Date(System.currentTimeMillis());
        order = new Order(expectedDate);

        assertEquals(expectedDate, order.getDate());
    }

    @Test
    public void orderCreation_noDateProvided() {
        assertNotNull(order);
    }
}
