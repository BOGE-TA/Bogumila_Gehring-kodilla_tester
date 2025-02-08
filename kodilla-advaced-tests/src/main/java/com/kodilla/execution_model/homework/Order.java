package com.kodilla.execution_model.homework;


import java.time.LocalDate;

public class Order {
    private final double value;
    private final LocalDate date;
    private final String login;

    public Order(double value, LocalDate date, String login) {
        this.value = value;
        this.date = date;
        this.login = login;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return String.format("Order{value=%.2f, date=%s, login='%s'}", value, date, login);
    }
}
