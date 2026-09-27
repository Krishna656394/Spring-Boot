package org.Core;

import org.Core.Payment.CardPayment;
import org.Core.Payment.PaymentService;
import org.Core.Payment.UPIPayment;
import org.Core1.CartService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("org.Core")
public class AppConfig {

    @Bean
    public User createUser(){
        return new User("Krishna", 22);
    }

    @Bean
    public CartService creteCartService(){
        return new CartService();
    }

    @Bean
//    @Primary
    @Qualifier("Card")
    public PaymentService createCardPayment(){
        return new CardPayment();
    }

    @Bean
    @Qualifier("Upi")
    public PaymentService createUPIPayment(){
        return new UPIPayment();
    }

    @Bean
    public OrderService createOrderService(@Qualifier("Card") PaymentService paymentService){
        return new OrderService(paymentService);
    }
}
