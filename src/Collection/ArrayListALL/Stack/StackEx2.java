package Collection.ArrayListALL.Stack;

import java.util.Stack;

public class StackEx2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Ro123213ma");
        stack.push("ewfa");
        stack.push("wefa");
        stack.push("Roma");
        System.out.println(stack);

        System.out.println(stack.peek());

//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//            System.out.println(stack);
//        }
    }
}
