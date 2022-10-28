package Collection.ArrayListALL.IteratorEx;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Roma");
        arrayList.add("Petya");
        arrayList.add("Vasa");
        arrayList.add("geen");
        arrayList.add("geen");
        arrayList.add("geen");
        arrayList.add("geen");
        arrayList.add("geen");

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
    }
}
