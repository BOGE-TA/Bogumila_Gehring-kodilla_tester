package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
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

        assertEquals("Matthew Blue", students.get(0).getTeacherName());
        assertEquals("<undefined>", students.get(1).getTeacherName());
        assertEquals("Anne Windsor", students.get(2).getTeacherName());
        assertEquals("<undefined>", students.get(3).getTeacherName());
    }
}

