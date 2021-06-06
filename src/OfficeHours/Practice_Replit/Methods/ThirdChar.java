package OfficeHours.Practice_Replit.Methods;
import java.util.*;
public class ThirdChar {
    public static void main(String[] args) {
        String str = "apples";
        int temp = 0;
        int count = 0;
        String numlet = "";
        for(int i = 0; i < str.length(); i++){
                count =0;
            for (int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }

            }
            if(!numlet.contains(str.charAt(i) +"")) {
                numlet += "" + count + str.charAt(i);

            }


        }

        System.out.println(numlet);

    }

    }
