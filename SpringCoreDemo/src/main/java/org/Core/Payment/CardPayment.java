package org.Core.Payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("CP")//Bean Name CP
public class CardPayment implements PaymentService{
    @Override
    public void pay(){
        System.out.println("Payment Successfully Done By Card");
    }
}
