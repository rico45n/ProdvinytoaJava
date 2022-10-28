package Collection.ArrayListALL.LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LLI {
    public static void main(String[] args) {
         String s = "madam";
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()){
            list.add(c);
        }
        ListIterator<Character> lc = list.listIterator();
        ListIterator<Character> lc2 = list.listIterator(list.size());
        boolean t = true;
        while (lc.hasNext() && lc2.hasPrevious()){
            if (lc.next() != lc2.previous()) {
                t = false;
                break;
            }
        }

        if (t){
            System.out.println("Polidrom");
        }
        else {
            System.out.println("Ne polidrom");
        }
    }
}
