package PoramitrizeALl.ParametrizedClass;

import java.util.StringTokenizer;

public class ParamClass2 {
    public static void main(String[] args) {
        Fair<String , Integer> fair = new Fair<>("1: " , 2);
        System.out.println(fair.getValue() + fair.getValue2());
        Fair2<String> stringFair2 = new Fair2<>("213" , "wedf");
    }
}

class Fair<V1 , V2>{
    private V1 value;
    private V2 value2;

    public Fair(V1 value, V2 value2) {
        this.value = value;
        this.value2 = value2;
    }

    public V1 getValue() {
        return value;
    }


    public V2 getValue2() {
        return value2;
    }

}

class Fair2<V> {
    private V value;
    private V value2;

    public Fair2(V value, V value2) {
        this.value = value;
        this.value2 = value2;
    }

    public V getValue() {
        return value;
    }


    public V getValue2() {
        return value2;
    }
}