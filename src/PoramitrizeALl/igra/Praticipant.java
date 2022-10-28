package PoramitrizeALl.igra;

abstract public class Praticipant {
    private String name;
    private int age;

    public Praticipant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
