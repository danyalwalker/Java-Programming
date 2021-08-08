package OfficeHours.Practice.certification.static_members;

public class StaticExamples {
    public int number = 1;
    public static int count = 0;
    public static void main(String[] args) {
// static variable // static method
        System.out.println(count); }
}

class Tester {
    public static void main(String[] args) {
        StaticExamples.main(new String[0]);
        StaticExamples S = new StaticExamples();
        System.out.println(S.count);
        S = null; // Java does not care S is null since we are loooking for a static , it does not matter.
        System.out.println(S.count);
        S = null;
        S.main(new String[0]);
        S = null;
       // System.out.println(S.number); nullpointer exception since number is not static.

        StaticExamples.count = 4;
        StaticExamples a = new StaticExamples();
        StaticExamples b = new StaticExamples();
        a.count = 7;
        b.count = 3;
        System.out.println(StaticExamples.count);
        System.out.println(a.count);
        System.out.println(b.count);

    }
}