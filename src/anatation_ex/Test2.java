package anatation_ex;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class xiomiClass = Class.forName("anatation_ex.Xiaomi");
        Annotation annotation1 = xiomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation1;
        System.out.println("Annotation info from XIAOMI class :" + sm1.OS() + " , " + sm1.yearOfCompanyCreation());



        Class iphoneClass = Class.forName("anatation_ex.Iphone");
        Annotation annotation2 = iphoneClass.getAnnotation(SmartPhone.class);
        SmartPhone sm2 = (SmartPhone) annotation2;
        System.out.println("Annotation info from IPHONE class :" + sm2.OS() + " , " + sm2.yearOfCompanyCreation());
    }
}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String OS() default  "Android";
    int yearOfCompanyCreation();
}


@SmartPhone(yearOfCompanyCreation = 2010)
class Xiaomi{
    String model;
    double price;
}

@SmartPhone(OS = "IOS" , yearOfCompanyCreation = 1976)
class Iphone{
    String model;
    double price;
}