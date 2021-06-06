package OfficeHours.Practice;

public class Ternary {
    public static void main(String[] args) { 
        int day = 9,night= 18;
        int time;
       time = (day>=0 && day<=11)? day:night;
        System.out.println("Day time = " + time);
        time = (night>=12 && night<=24)? night:day;
        System.out.println("Night time = " + time);
    }
}
