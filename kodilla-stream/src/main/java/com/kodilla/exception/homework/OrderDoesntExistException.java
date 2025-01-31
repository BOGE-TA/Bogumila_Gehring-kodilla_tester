package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Krok 1: Klasa wyjątku
public class OrderDoesntExistException extends Exception {
    public OrderDoesntExistException(String message) {
        super(message);
    }
}