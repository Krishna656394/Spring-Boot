package in.strikes;

import java.util.HashMap;
import java.util.Map;

public class CartService2 {

    Map<Integer, String> map;

    public CartService2(){
        map = new HashMap<>();
        System.out.println("CartService2 Constructor Called");
    }

    public String getName(int key){
        return map.get(key);
    }

    public void start(){
        System.out.println("init Method Called Bean is Ready");
        map.put(1, "Krishna Yadav");
        map.put(2, "Randhir Kumar");
    }

    public void stop(){
        map.clear();
        System.out.println("Bean is Getting Destroyed");
    }
}
