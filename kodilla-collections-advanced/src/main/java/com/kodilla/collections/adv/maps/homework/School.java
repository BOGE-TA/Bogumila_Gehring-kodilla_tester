package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class School {
    private final String name;
    private final List<Integer> studentCounts;

    public School(String name, List<Integer> studentCounts) {
        this.name = name;
        this.studentCounts = studentCounts;
    }

    public String getName() {
        return name;
    }

    public int getTotalStudents() {
        return studentCounts.stream().mapToInt(Integer::intValue).sum();
    }
}

