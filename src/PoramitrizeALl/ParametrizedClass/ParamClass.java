package PoramitrizeALl.ParametrizedClass;


import java.util.ArrayList;
import java.util.List;

public class ParamClass {
    public static void main(String[] args) {
//        Info<String> info = new Info<>("Pizduk");
//
//        System.out.println(info.getValue());



    }
    public void abc(Info<String> info){
        String s = info.getValue();
    }
    public void def(Info<Integer> info){
        Integer i = info.getValue();
    }
}


class Info <T >{
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "[[" + value + "]]";
    }

    public T getValue() {
        return value;
    }
}


class Parent{
    public void abc(Info<String> info){
        String s = info.getValue();
    }
}

//class Clihh extends Parent{
//    public void abc(Info<Integer> info){
//        Integer s = info.getValue();
//    }
//}