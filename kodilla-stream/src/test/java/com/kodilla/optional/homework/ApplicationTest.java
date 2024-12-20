package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    @Test
    public void testStudentsWithTeachers() {
        List<Student> students = Arrays.asList(
                new Student("Marc Darcy", new Teacher("Matthew Blue")),
                new Student("Kevin McQuinn", null),
                new Student("Peter Law", new Teacher("Anne Windsor")),
                new Student("Rebeca Perry", null)
        );

        assertEquals("Matthew Blue", getTeacherName(students.get(0)));
        assertEquals("<undefined>", getTeacherName(students.get(1)));
        assertEquals("Anne Windsor", getTeacherName(students.get(2)));
        assertEquals("<undefined>", getTeacherName(students.get(3)));
    }

    private String getTeacherName(Student student) {
        return Optional.ofNullable(student.getTeacher())
                .map(Teacher::getName)
                .orElse("<undefined>");
    }
}
