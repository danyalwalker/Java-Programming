package OfficeHours.Practice_Replit.Arrays;

import java.util.*;
import java.util.Arrays;

public class ReverseChar {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec(in.next()));

    }

    public static String reverseNoSpec(String str) {
        char[] letters = str.toCharArray();

        for(int i=letters.length-1, j=0; 0<=i; j++,i--){
            if(Character.isLetter(letters[i])){
                char temp = letters[i];
                letters[i] = letters[j];
                letters[j] = temp;

            }

        }

        // your code here


        return Arrays.toString(letters);

    }


}
