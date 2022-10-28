package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tst1 {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.stream().filter(p -> p.intValue()>2).forEach(System.out::println);

//        List<Integer> list2 = list.stream().map(el -> el.length()).collect(Collectors.toList());
//        list2.forEach(System.out::println);

    }
}
