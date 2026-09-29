package org.Core.notification;

public class FakeEmailService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Dummy Email Send");
    }
}
