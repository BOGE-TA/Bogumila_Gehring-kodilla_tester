package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;


public class UsersManager {
    public UsersManager(UsersRepository testRepository) {
    }

    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }

    private static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList() //[1]

                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList()); // [2]
        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}
