package OfficeHours.Practice_Replit.Arrays;
import java.util.*;
public class FirstLastChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for (int i = 0; i < 5 ; i++) {
            System.out.print(words[i].charAt(0));
            System.out.println(words[i].charAt(words[i].length() - 1));

        }
        for (String each : words) {
            System.out.println("[");
            System.out.print( each.charAt(0) + each.charAt(each.length() - 1) + ", ");
            System.out.println("]");
        }
        System.out.print("[");
        for (int i = 0; i < 5 ; i++) {

            System.out.print("" + words[i].charAt(0));
            System.out.print("" + words[i].charAt(words[i].length() - 1));
            if(i<4){
                System.out.print(", ");

            }

        }
        System.out.print("]");
    }
}
