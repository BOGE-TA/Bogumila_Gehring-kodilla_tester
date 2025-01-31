package com.kodilla.exception.homework;

// Krok 4: Klasa WarehouseApp
public class WarehouseApp {
    public static <Warehouse> void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        // Dodawanie zamówień
        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("456"));
        warehouse.addOrder(new Order("789"));

        try {
            // Próba znalezienia istniejącego zamówienia
            System.out.println("Found order: " + warehouse.getClass("123").getNumber());

            // Próba znalezienia nieistniejącego zamówienia
            System.out.println("Found order: " + warehouse.getClass("999").getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
