package day47_constructors;

public class StudentObjects {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();

        Student st3 = new Student("Henry");

        Student st4 = new Student(61);
        Student st5 = new Student(42, " Daniel");

    }
}
