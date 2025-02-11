package com.kodilla.mockito.homework;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

class WeatherAlertServiceTest {
    private WeatherAlertService service;
    private NotificationSender notificationSender;

    @BeforeEach
    void setUp() {
        notificationSender = mock(NotificationSender.class);
        service = new WeatherAlertService(notificationSender);
    }

    @Test
    void testSubscribeAndNotifyLocation() {
        service.subscribe("user1", "location1");
        service.notifyLocation("location1", "Tornado Alert");
        verify(notificationSender).send("user1", "Tornado Alert");
    }

    @Test
    void testUnsubscribe() {
        service.subscribe("user1", "location1");
        service.unsubscribe("user1", "location1");
        service.notifyLocation("location1", "Tornado Alert");
        verify(notificationSender, never()).send(anyString(), anyString());
    }

    @Test
    void testUnsubscribeAll() {
        service.subscribe("user1", "location1");
        service.subscribe("user1", "location2");
        service.unsubscribeAll("user1");
        service.notifyAllUsers("Tornado Alert");
        verify(notificationSender, never()).send(anyString(), anyString());
    }

    @Test
    void testNotifyAllUsers() {
        service.subscribe("user1", "location1");
        service.subscribe("user2", "location2");
        service.notifyAllUsers("Global Alert");
        verify(notificationSender).send("user1", "Global Alert");
        verify(notificationSender).send("user2", "Global Alert");
    }

    @Test
    void testDeleteLocation() {
        service.subscribe("user1", "location1");
        service.deleteLocation("location1");
        service.notifyLocation("location1", "Tornado Alert");
        verify(notificationSender, never()).send(anyString(), anyString());
    }
}
