package com.kodilla.collections.adv.maps.homework;

import java.util.*;

class Principal {
    private String name;

    public Principal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "name='" + name + '\'' +
                '}';
    }
}