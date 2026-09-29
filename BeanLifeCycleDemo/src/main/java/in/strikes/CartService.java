package in.strikes;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

//@Component
public class CartService implements InitializingBean /* InitializingBean Method 1 */ , DisposableBean {

    Map<Integer, String> map;
    public CartService(){
        map = new HashMap<>();
        System.out.println("CartService Constructor Called");
    }

    public void addToCart(){
        System.out.println("Item Added");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean Called Bean is Ready");
        map.put(1, "Krishna Yadav");
        map.put(2, "Randhir Kumar");
    }

    public String getName(int key){
        return map.get(key);
    }

    @Override
    public void destroy() throws Exception {
        map.clear();
        System.out.println("Bean is Getting Destroyed");
    }
}
