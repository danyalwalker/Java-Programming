package OfficeHours.Practice_Replit.Methods;
import java.util.*;
public class HamletLogic {
    public static boolean hamletQuote(boolean toBe,boolean notToBe){
        // your code here
        boolean result = false;
        if( toBe == true && notToBe == true){
            result = true;
        } else if( toBe == true && notToBe == false){
            result = true;
        } else if( toBe == false && notToBe == true){
            result = true;
        } else if( toBe == false && notToBe == false){
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(hamletQuote(in.nextBoolean(), in.nextBoolean()));
    }
}

