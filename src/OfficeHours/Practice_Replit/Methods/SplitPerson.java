package OfficeHours.Practice_Replit.Methods;
import java.util.*;
public class SplitPerson {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info) {
        //your code here
        String []arr = info.split(",");
        System.out.println("person name: " + arr[0]);
        System.out.println("last name: "+ arr[1]);
        System.out.println("age: "+ arr[2]);





    }
}
