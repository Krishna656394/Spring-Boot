package org.Core;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Scope("singleton")  // eager Initialization
//@Scope("prototype") // Lazy Initialization
public class OrderService {
    public OrderService(){
        System.out.println("OrderService Created.");
    }
    public void placeOrder(){
        System.out.println("Order Placed.");
    }
}

//States of user --> stateless
// So make it Scope is singleton.
