package Collection.ArrayListALL.LinkedList;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        Student st = new Student("Roma" , 4);
        Student st2 = new Student("Roma" , 4);
        Student st3 = new Student("Roma" , 4);
        Student st4 = new Student("Roma" , 4);
        Student st5 = new Student("Roma" , 4);
        LinkedList<Student> list = new LinkedList<>();
        list.add(st);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        System.out.println(list);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

    }
}



class Student{
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}