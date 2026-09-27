package org.Core;

import org.Core1.CartService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order = context.getBean(OrderService.class);
        order.orderService();

//        PaymentService payment = context.getBean(PaymentService.class);
//        payment.pay();

//        User user = context.getBean(User.class);
//        System.out.println(user.getName());
//        System.out.println(user.getAge());
//
//        CartService cartService = context.getBean(CartService.class);
//        cartService.addTocart();
    }
}