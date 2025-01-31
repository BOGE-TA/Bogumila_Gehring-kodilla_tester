package com.kodilla.exception.homework;

import com.kodilla.exception.homework.Order;

import java.util.ArrayList;
import java.util.List;

// Krok 3: Klasa Warehouse
class Warehouse {
    private final List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orders.stream()
                .filter(order -> order.getNumber().equals(number))
                .findFirst()
                .orElseThrow(() -> new OrderDoesntExistException("Order with number " + number + " doesn't exist."));
    }
}
