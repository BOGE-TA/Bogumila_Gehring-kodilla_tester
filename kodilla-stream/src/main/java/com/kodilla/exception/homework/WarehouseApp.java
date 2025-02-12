package com.kodilla.exception.homework;


public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        // Adding orders
        warehouse.addOrder(new Order("1012"));
        warehouse.addOrder(new Order("1013"));
        warehouse.addOrder(new Order("1014"));

        try {
            // Searching for an existing order
            Order foundOrder = warehouse.getOrder("1012");
            System.out.println("Found order: " + foundOrder.getNumber());

            // Trying to search for a non-existent order
            warehouse.getOrder("5555");
        } catch (OrderDoesntExistException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

