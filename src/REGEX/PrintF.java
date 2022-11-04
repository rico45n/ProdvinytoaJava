package REGEX;

public class PrintF {

    public static void main(String[] args) {
        String st = String.format("%03d \t %-12s \t %-5s \t %,.1f" , 1 , "Roman" , "Pesnin" , 1234*(1+0.33));
        System.out.printf(st);
    }
}
