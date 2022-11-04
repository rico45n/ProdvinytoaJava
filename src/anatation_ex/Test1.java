package anatation_ex;

public class Test1 {
    public static void main(String[] args) {
        Parent p = new Child("roma");
        p.showInfo();
    }
}


class Parent{

    String name;

    public Parent(String name) {
        this.name = name;
    }

    @Deprecated
    void showInfo(){
        System.out.println("Parent Name  = " + name);
    }

}


class Child extends Parent{

    public Child(String name) {
        super(name);
    }

    @Override
    void showInfo(){
        System.out.println("Chiled Name  = " + name);
    }
}
