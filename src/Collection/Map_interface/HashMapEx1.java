package Collection.Map_interface;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer , String> map1 = new HashMap<>();
        map1.put(1,"Roman");
        map1.put(2,"Oleg");
        map1.put(3,"Pavel");
        map1.put(4,"Nikitos");
        map1.put(5,"Pizduck");
        System.out.println(map1);
    }
}
