package com.kodilla.execution_model.homework;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order order;
    String expected;

    @BeforeEach
//@BeforeAll
    public void setUp() {
        order = new Order(150.75, LocalDate.of(2025, 2, 5), "user1");
        expected = "Order{value=150.75, date=2025-02-05, login='user1'}";
    }

    @Test
    void testOrderCreation() {
        assertEquals(150.75, order.getValue());
        assertEquals(LocalDate.of(2025, 2, 5), order.getDate());
        assertEquals("user1", order.getLogin());
    }

    @Test
    void testToString() {
        assertEquals(expected, order.toString());
    }
}
