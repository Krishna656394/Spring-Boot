package org.Core.notification;

public class PopUpNotification implements NotificationService{

    @Override
    public void sendNotification(){
        System.out.println("Pop-Up Notification Send");
    }
}
