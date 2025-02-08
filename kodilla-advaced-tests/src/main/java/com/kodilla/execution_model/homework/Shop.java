package com.kodilla.execution_model.homework;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private final Set<Order> orders = new HashSet<>();

    // Adding a new order
    public void addOrder(Order order) {
        orders.add(order);
    }

    // Return of orders between two dates
    public Set<Order> getOrdersBetweenDates(LocalDate startDate, LocalDate endDate) {
        return orders.stream()
                .filter(order -> !order.getDate().isBefore(startDate) && !order.getDate().isAfter(endDate))
                .collect(Collectors.toSet());
    }

    // Zwrócenie zamówień w określonym przedziale wartości
    public Set<Order> getOrdersByValueRange(double minValue, double maxValue) {
        return orders.stream()
                .filter(order -> order.getValue() >= minValue && order.getValue() <= maxValue)
                .collect(Collectors.toSet());
    }

    // Liczba zamówień
    public long getNumberOfOrders() {
        return orders.size();
    }

    // Suma wartości zamówień
    public double getTotalValue() {
        return orders.stream().mapToDouble(Order::getValue).sum();
    }
}


