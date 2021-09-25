package OfficeHours.Practice.certification.increments;

public class TernaryPractice {
    public static void main(String[] args) {
        int x = 100;
        int a = x++;
        int b = ++x;
        int c = x++;

        int d = (a<b)?a:c;
        System.out.println(d);
    }

}
