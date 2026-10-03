package org.Core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    private PaymentService paymentService;

//    public OrderService(PaymentService paymentService){
//        this.paymentService = paymentService;
//    }

    public void placeOrder(){
        paymentService.pay();

        //call here getOrder details
        getOrderDetails();

        System.out.println("Order Is Placed");
    }
    public void getOrderDetails(){
        System.out.println("Order Details is Saved.");
    }
}
