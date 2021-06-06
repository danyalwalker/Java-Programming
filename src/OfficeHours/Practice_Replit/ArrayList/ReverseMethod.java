package OfficeHours.Practice_Replit.ArrayList;
import java.util.*;

import java.util.Arrays;

public class ReverseMethod {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec(in.next()));

    }

    public static String reverseNoSpec(String str) {
        int size = str.length()-1;
        String result = "";
        for (int i = 0; i < str.length() ; i++) {
            if(Character.isLetter(str.charAt(i))){
                for (int j = size; j >=0 ; j--) {
                    if(Character.isLetter(str.charAt(j))){
                        result += str.charAt(j);
                        size = j-1;
                        break;
                    }

                }
            } else{
                result += str.charAt(i);
            }
        }
         return result;
        }
}
