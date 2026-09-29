package org.Core;

import org.Core.notification.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificationService notification = new FakeEmailService();

        //Dependency is injected through Constructor Method.
//        OrderService order = new OrderService(notification);

        OrderService order = new OrderService();

        // Dependency is injected through Setter Method.
        order.setNotification(notification);
        order.placeOrder();
    }
}

//A class Should ask what it needs and not
// Build everything itself.


// IOC --> Inversion of Control.