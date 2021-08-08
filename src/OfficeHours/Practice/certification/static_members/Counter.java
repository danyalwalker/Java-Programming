package OfficeHours.Practice.certification.static_members;

public class Counter {
    private static int count;
    private int count2;
    public Counter() {
        count++;
        count2++;
    }
    public static void main(String[] args) {
        count++;
       // count2++; doe not compile
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(count);
        System.out.println("c3.count = " + c3.count);
        System.out.println("c3.count2 = " + c3.count2);
    }
}
