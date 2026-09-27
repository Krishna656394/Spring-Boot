package in.strikes.SpringBootDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemo2Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootDemo2Application.class, args);
//		PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);
//
//		paymentGateway.print();

//		paymentGateway.setType("Paytm");
//		paymentGateway.setRetryCount(3);

//		System.out.println(paymentGateway.getType());
//		System.out.println(paymentGateway.getRetryCount());
//		System.out.println(paymentGateway.isEnabled());
//		System.out.println(paymentGateway.getTimeout());
	}

}
