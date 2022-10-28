package Collection.ArrayListALL.Stack;

public class StackEx {
    static void abc(){
        System.out.println("abc starts");
        System.out.println("abc and");
    }

    static void abc2(){
        System.out.println("abc2 starts");
        abc();
        System.out.println("abc2 ends");
    }


    static void abc3(){
        System.out.println("abc3 starts");
        abc2();
        System.out.println("abc3 ends");
    }

    public static void main(String[] args) {
        System.out.println("Main start");
        abc3();
        System.out.println("Main ends");
    }
}
