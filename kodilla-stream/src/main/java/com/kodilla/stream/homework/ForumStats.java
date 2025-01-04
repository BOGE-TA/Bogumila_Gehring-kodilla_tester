package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {

    public static double getAveragePostsForUsersAbove40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .orElse(0.0);
    }

    public static double getAveragePostsForUsersBelow40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();

        double averagePostsAbove40 = getAveragePostsForUsersAbove40(users);
        double averagePostsBelow40 = getAveragePostsForUsersBelow40(users);

        System.out.println("Average number of posts for users >= 40 years old: " + averagePostsAbove40);
        System.out.println("Average number of posts for users < 40 years old: " + averagePostsBelow40);
    }
}


