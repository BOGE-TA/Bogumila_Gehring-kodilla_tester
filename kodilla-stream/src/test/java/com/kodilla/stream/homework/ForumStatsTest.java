package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTest {

    @Test
    public void testGetAveragePostsForUsersAbove40() {
        // Preparation of test data
        List<User> testUsers = Arrays.asList(
                new User("Annette Brown", 45, 15, "Chemists"),
                new User("Marie Curie", 50, 10, "Physicists"),
                new User("Katharine Gold", 25, 20, "Mathematicians")
        );

        // Invoking the method
        double average = ForumStats.getAveragePostsForUsersAbove40(testUsers);

        // Checking the result
        assertEquals(12.5, average, 0.01);
    }

    @Test
    public void testGetAveragePostsForUsersBelow40() {
        // Preparation of test data
        List<User> testUsers = Arrays.asList(
                new User("Anette Brown", 45, 15, "Chemists"),
                new User("Marie Curie", 50, 10, "Physicists"),
                new User("Katharine Gold", 25, 20, "Mathematicians")
        );

        // Invoking the method
        double average = ForumStats.getAveragePostsForUsersBelow40(testUsers);

        // Checking the result
        assertEquals(20.0, average, 0.01);
    }

    @Test
    public void testGetAveragePostsForUsersAbove40WithNoUsers() {
        // Preparation of test data
        List<User> testUsers = Arrays.asList(
                new User("Katharine Gold", 25, 20, "Mathematicians")
        );

        // Invoking the method
        double average = ForumStats.getAveragePostsForUsersAbove40(testUsers);

        // Checking the result
        assertEquals(0.0, average, 0.01);
    }

    @Test
    public void testGetAveragePostsForUsersBelow40WithNoUsers() {
        // Preparation of test data
        List<User> testUsers = Arrays.asList(
                new User("Anette Brown", 45, 15, "Chemists"),
                new User("Marie Curie", 50, 10, "Physicists")
        );

        // Invoking the method
        double average = ForumStats.getAveragePostsForUsersBelow40(testUsers);

        // Checking the result
        assertEquals(0.0, average, 0.01);
    }
}

