package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    private static List<User> filteredUsers;
    private static List<String> expectedChemists;

    @BeforeAll
    static void setUp() {
        filteredUsers = UsersManager.filterUsersOlderThan(30);
        expectedChemists = UsersRepository.getUsersList().stream()
                .filter(user -> "Chemists".equals(user.getGroup()))
                .map(User::getUsername)
                .toList();
    }

    private void assertNotEmpty(List<?> list, String message) {
        assertFalse(list.isEmpty(), message);
    }

    @Test
    @DisplayName("Filtering test of users older than 30 years.")
    void testFilterUsersOlderThan() {
        assertNotEmpty(filteredUsers, "The list of users should not be empty.");
        assertTrue(filteredUsers.stream().allMatch(user -> user.getAge() > 30),
                "All users should be older than 30 years old.");
    }

    @Test
    @DisplayName("Filter test of users older than 100 years (no results).")
    void testFilterUsersOlderThanWithNoResults() {
        assertTrue(UsersManager.filterUsersOlderThan(100).isEmpty(),
                "The list should be empty when no user meets the condition.");
    }

    @Test
    @DisplayName("Chemists user filtering test.")
    void testFilterChemistGroupUsernames() {
        List<String> chemistUsernames = UsersManager.filterChemistGroupUsernames();
        assertNotEmpty(chemistUsernames, "The list should not be empty.");
        assertIterableEquals(expectedChemists, chemistUsernames);
    }

    @Test
    @DisplayName("Chemists user filtering test (no results).")
    void testFilterChemistGroupUsernamesWithNoResults() {
        if (expectedChemists.isEmpty()) {
            assertTrue(UsersManager.filterChemistGroupUsernames().isEmpty(),
                    "The list should be empty when there are no users in the Chemists group.");
        }
    }
}




