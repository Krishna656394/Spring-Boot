package org.Core;

import org.Core.Payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {

//    @Autowired  Field Injuction.
    private final PaymentService paymentService;

//    @Autowired
//    public OrderService(@Qualifier("UP") PaymentService paymentService){
//        this.paymentService = paymentService;
//    }
@Autowired
public OrderService(PaymentService paymentService){
    this.paymentService = paymentService;
}

//    @Autowired
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void orderService(){
        paymentService.pay();
        System.out.println("Order Placed.");
    }
}
