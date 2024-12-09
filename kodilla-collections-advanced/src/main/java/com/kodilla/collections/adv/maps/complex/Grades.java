package com.kodilla.collections.adv.maps.complex;

import java.util.Arrays;
import java.util.List;

public class Grades {
    private List<Double> grades;

    public Grades(Double... grades) {
        this.grades = Arrays.asList(grades);
    }

    public List<Double> getGrades() {
        return grades;
    }

    public double getAverage() {
        return grades.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    @Override
    public String toString() {
        return "Grades: " + grades.toString();
    }
}
