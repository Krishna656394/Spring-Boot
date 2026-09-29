package in.strikes;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

//@Component
public class CartService3 implements BeanNameAware, ApplicationContextAware {

    Map<Integer, String> map;
    public CartService3(){
        map = new HashMap<>();
        System.out.println("CartService3 Constructor Called");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name Is "+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext name is "+applicationContext.getDisplayName());
    }

    public void addToCart(){
        System.out.println("Item Added");
    }


    @PostConstruct
    public void start() throws Exception {
        System.out.println("InitializingBean Called Bean is Ready");
        map.put(1, "Krishna Yadav");
        map.put(2, "Randhir Kumar");
    }

    public String getName(int key){
        return map.get(key);
    }

    @PreDestroy
    public void stop(){
        map.clear();
        System.out.println("Bean is Getting Destroyed");
    }


}
