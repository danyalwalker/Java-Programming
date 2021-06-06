package OfficeHours.Practice_Replit.StringManipulation;
import java.util.Scanner;
public class MIddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.length()>=3 && word.length() % 2 != 0){
            System.out.print(word.charAt(word.length()/2));
        }
        if(word.length() == 1){
            System.out.print(word.charAt(0));
            System.out.print(word.charAt(0));
            System.out.print(word.charAt(0));
        }
        if(word.length()%2 == 0 && word.length() >= 4){
            System.out.print(word.charAt(word.length()/2-1));
            System.out.print(word.charAt(word.length()/2));
        }

        if ( word.length() == 2){
            System.out.print(word);
            System.out.print(word);
        }
    }
}
