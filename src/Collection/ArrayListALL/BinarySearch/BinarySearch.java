package Collection.ArrayListALL.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        int indx = Collections.binarySearch(arrayList , 129);

        System.out.println(indx);


    }
}
