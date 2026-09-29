package in.strikes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();

//        AppConfig config = context.getBean(AppConfig.class);
//        config.orderServiceBean();

//        CartService cart = context.getBean(CartService.class);
//        System.out.println(cart.getName(2));

//        CartService2 cart2 = context.getBean(CartService2.class);
//        System.out.println(cart2.getName(2));

//        CartService3 cart3 = context.getBean(CartService3.class);
//        System.out.println(cart3.getName(2));

        context.close();

    }
}