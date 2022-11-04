package REGEX;

import java.util.regex.Pattern;

public class RegEX6 {
   static void checkIP(String ip){
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" + "(25[0-5]|2[0-4]\\d |[01]?\\d?\\d)";
        System.out.println(ip + " is OK? " + Pattern.matches(regex , ip));
    }


    public static void main(String[] args) {
        String ip1 = "255.38.192.99";
        String ip2 = "192.168.0.1";
        RegEX6.checkIP(ip1);
        RegEX6.checkIP(ip2);
    }
}
