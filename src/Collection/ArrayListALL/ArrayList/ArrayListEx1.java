package Collection.ArrayListALL.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Roma");
        arrayList.add("Petya");
        arrayList.add("Vasa");
        arrayList.add("geen");
        arrayList.add("geen");
        arrayList.add("geen");
        arrayList.add("geen");
        arrayList.add("geen");

        ArrayList<String> arrayList3 = new ArrayList<>();

        for(String s : arrayList){
            if (!arrayList3.contains(s)){
                arrayList3.add(s);
            }
        }
        System.out.println(arrayList3);
    }
}
