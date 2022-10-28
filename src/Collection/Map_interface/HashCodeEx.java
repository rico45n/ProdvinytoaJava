package Collection.Map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx {
    public static void main(String[] args) {
        Map<Student , Double> map = new HashMap<>();
        Student st1 = new Student("Roma" , "Pesnin" , 4);
        Student st2 = new Student("Pupa" , "ger" , 2);
        Student st3 = new Student("Lupa" , "erger231" , 1);
        map.put(st1 , 5.2);
        map.put(st2 , 7.2);
        map.put(st3 , 1.2);

        System.out.println(map);

        Student st4 = new Student("Roma" , "Pesnin" , 4);
        Student st5 = new Student("igor" , "sidor" , 1);
        boolean rez = map.containsKey(st4);
        System.out.println(st3.hashCode());


    }


}


class Student{
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && name.equals(student.name) && surname.equals(student.surname);
    }

    @Override
    public int hashCode() {
        return name.length() + surname.length() + course;
    }
}