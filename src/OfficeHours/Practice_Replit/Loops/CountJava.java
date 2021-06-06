package OfficeHours.Practice_Replit.Loops;
import java.util.Scanner;
public class CountJava {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        int count = 0;
        String j = "", a = "", v = "", a2 = "";
        for(int i = 0; i< word.length()-3; i++){

            if((word.charAt(i)+""+ word.charAt(i+1) + word.charAt(i+2) + word.charAt(i+3)).equals("java")){
                count++;
            }

        }

        System.out.print(count);

    }
}
