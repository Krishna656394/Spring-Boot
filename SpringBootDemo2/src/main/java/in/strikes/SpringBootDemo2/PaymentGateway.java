package in.strikes.SpringBootDemo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {
//    @Value("${payment-gateway.type :rozarpay}")
//    private String type;
//
//    @Value("${payment-gateway.retrycount}")
//    private int retryCount;

    private PaymentProperty paymentProperties;

    public PaymentGateway(PaymentProperty paymentProperties){
        this.paymentProperties = paymentProperties;
    }

    public String getType() {
        return paymentProperties.getType();
    }

    public int getRetryCount() {
        return paymentProperties.getRetryCount();
    }

    public boolean isEnabled() {
        return paymentProperties.isEnabled();
    }

    public int getTimeout() {
        return paymentProperties.getTimeout();
    }

    public void print() {
        System.out.println(getType());
        System.out.println(getRetryCount());
        System.out.println(isEnabled());
        System.out.println(getTimeout());
    }
}

//@Value annotation for property set.
//    public PaymentGateway(@Value("${payment-gateway.type}")String type, @Value("${payment-gateway.retrycount}")int retryCount) {
//        this.type = type;
//        this.retryCount = retryCount;
//    }