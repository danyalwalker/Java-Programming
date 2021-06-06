package day47_constructors;

public class Student {
    // No_args constructor
    public Student() {
        System.out.println("No-args constructor");
    }

    // Constructor with 1 param: String name
    public Student(String name){
        System.out.println("Student name: " + name);
    }

    // constructor with age
    public Student(int age){
        System.out.println(age);
    }

    // constructor with name and age

    public Student(int age, String name){
        System.out.println(name + age);
    }
}
