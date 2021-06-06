package OfficeHours.Practice_Replit.Methods;
import java.util.*;
public class ExtractNumbers {
    public static String extractNum(String s) {
        String letters = "";
        for ( int i = 0; i< s.length(); i++){
            if(!(s.toLowerCase().charAt(i) >= 0 && s.toLowerCase().charAt(i) <= 9)){
                letters += s.charAt(i) + "";
            }
        }
        return letters;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));
    }
}
