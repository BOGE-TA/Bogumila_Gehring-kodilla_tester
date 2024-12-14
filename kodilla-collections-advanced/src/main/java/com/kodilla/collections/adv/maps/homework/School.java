package com.kodilla.collections.adv.maps.homework;

import java.util.List;

public class School {
    private String name; // school name
    private List<Integer> studentsInClasses;//  Number of students in each class

    public School(String name, List<Integer> studentsInClasses) {
        this.name = name;
        this.studentsInClasses = studentsInClasses;
    }

    public String getName() {
        return name;
    }

    public int getTotalStudents() {
        int total = 0;
        for (int students : studentsInClasses) {
            total += students;
        }
        return total;
    }

    @Override
    public String toString() {
        return name;
    }
}

