package PoramitrizeALl.WildCards;

import java.util.ArrayList;
import java.util.List;

public class ParamWClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("fger");
        list.add("fger123");
        list.add("fger4536");


        List<Double> list2 = new ArrayList<>();
        list2.add(3.2);
        list2.add(3.5);
        list2.add(3.27);
        abc(list);
    }

    static void abc(List<?> list){
        System.out.println(list);
    }
}
