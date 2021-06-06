package OfficeHours.Practice_Replit.Methods;
import java.util.*;
public class Anagram {
    public static boolean isAnagram(String word1, String word2) {
                boolean check = false;
        for (int i = 0; i < word1.length() ; i++) {
            if(!word2.trim().toLowerCase().contains(word1.trim().toLowerCase().charAt(i) + "")){
                check = false;
                break;
            } else{
                check = true;
            }
        }

        return check;

    }

    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
    }
}
