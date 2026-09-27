package org.Core.Payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
//@Qualifier("UP")//bean name UP
public class UPIPayment implements PaymentService{
    @Override
    public void pay(){
        System.out.println("Payment Successfully Done By UPI");
    }
}
