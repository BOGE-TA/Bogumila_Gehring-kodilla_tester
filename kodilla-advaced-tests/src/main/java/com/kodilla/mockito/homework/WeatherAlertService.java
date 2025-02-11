package com.kodilla.mockito.homework;

import java.util.*;

class WeatherAlertService {
    private final Map<String, Set<String>> subscriptions = new HashMap<>();
    private final NotificationSender notificationSender;

    public WeatherAlertService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void subscribe(String user, String location) {
        subscriptions.computeIfAbsent(location, k -> new HashSet<>()).add(user);
    }

    public void unsubscribe(String user, String location) {
        if (subscriptions.containsKey(location)) {
            subscriptions.get(location).remove(user);
            if (subscriptions.get(location).isEmpty()) {
                subscriptions.remove(location);
            }
        }
    }

    public void unsubscribeAll(String user) {
        for (Set<String> users : subscriptions.values()) {
            users.remove(user);
        }
        subscriptions.values().removeIf(Set::isEmpty);
    }

    public void notifyLocation(String location, String message) {
        if (subscriptions.containsKey(location)) {
            for (String user : subscriptions.get(location)) {
                notificationSender.send(user, message);
            }
        }
    }

    public void notifyAllUsers(String message) {
        Set<String> allUsers = new HashSet<>();
        for (Set<String> users : subscriptions.values()) {
            allUsers.addAll(users);
        }
        for (String user : allUsers) {
            notificationSender.send(user, message);
        }
    }

    public void deleteLocation(String location) {
        subscriptions.remove(location);
    }
}

interface NotificationSender {
    void send(String user, String message);
}
