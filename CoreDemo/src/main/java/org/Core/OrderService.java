package org.Core;

import org.Core.notification.EmailService;
import org.Core.notification.NotificationService;
import org.Core.notification.PopUpNotification;

public class OrderService {

    NotificationService notification;

    public OrderService(NotificationService notification){
        this.notification = notification;
    }

    public OrderService(){

    }

    public void placeOrder(){
        System.out.println("Order Placed");
        //Some Actual Business Logic...
        notification.sendNotification();
    }

    public void setNotification(NotificationService notification) {
        this.notification = notification;
    }
}
