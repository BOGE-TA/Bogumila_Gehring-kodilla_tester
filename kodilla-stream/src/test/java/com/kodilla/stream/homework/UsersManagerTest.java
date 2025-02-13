package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class UsersManagerTest {

    private void assertNotEmpty(List<?> list, String message) {
        assertFalse(list.isEmpty(), message);
    }

    @Test
    void testFilterUsersOlderThan() {
        List<User> filteredUsers = UsersManager.filterUsersOlderThan(30);
        assertNotEmpty(filteredUsers, "The list of users should not be empty..");
        assertTrue(filteredUsers.stream().allMatch(user -> user.getAge() > 30),
                "All users should be older than 30 years old.");
    }

    @Test
    void testFilterUsersOlderThanWithNoResults() {
        assertTrue(UsersManager.filterUsersOlderThan(100).isEmpty(),
                "The list should be empty when no one meets the condition..");
    }

    @Test
    void testFilterChemistGroupUsernames() {
        List<String> expectedChemists = UsersRepository.getUsersList().stream()
                .filter(user -> "Chemists".equals(user.getGroup()))
                .map(User::getUsername)
                .toList();

        List<String> chemistUsernames = UsersManager.filterChemistGroupUsernames();
        assertNotEmpty(chemistUsernames, "The list should not be empty.");
        assertIterableEquals(expectedChemists, chemistUsernames);
    }

    @Test
    void testFilterChemistGroupUsernamesWithNoResults() {
        List<String> chemistUsernames = UsersManager.filterChemistGroupUsernames();
        if (UsersRepository.getUsersList().stream().noneMatch(user -> "Chemists".equals(user.getGroup()))) {
            assertTrue(chemistUsernames.isEmpty(), "LThe list should be empty when there are no users in the Chemists group.");
        }
    }
}



