package OfficeHours.Practice_Replit.Methods;
import java.util.*;
public class NoDuplicateChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        //TODO: write your code
        String noDup = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) != str.charAt(j) ) {
                    if(!(noDup.contains(str.charAt(i) + ""))){
                    noDup += str.charAt(i) + "";
                    }
                }




            }
        }
        return noDup;
    }
}