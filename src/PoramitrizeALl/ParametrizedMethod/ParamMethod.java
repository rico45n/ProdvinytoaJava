package PoramitrizeALl.ParametrizedMethod;

import java.util.ArrayList;

public class ParamMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(23);
        int a = GenMethod.getSecondEl(arrayList);
        System.out.println(a);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("5");
        arrayList2.add("10");
        arrayList2.add("23");
        String s = GenMethod.getSecondEl(arrayList2);
        System.out.println(s);
    }

}

class GenMethod{
    public static <T> T getSecondEl(ArrayList<T> arrayList){
        return arrayList.get(1);
    }
}
