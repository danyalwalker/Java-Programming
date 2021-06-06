package OfficeHours.Practice_Replit.Methods;
import java.util.*;
public class threeLocks {
    public static boolean threeLocks(boolean a, boolean b, boolean c) {
        a= false; b = false;  c= false;
        if(a == true && b == true ){
            return true;
        } else if(c==true){
            return true;
        } else {
            return false;
        }


    }//end threeLocks

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(threeLocks(in.nextBoolean(), in.nextBoolean(),in.nextBoolean()));
    }
}
