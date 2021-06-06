package OfficeHours.Practice_Replit.Loops;
import java.util.Scanner;
public class JavaPhytonMatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countJava = 0;
        int countPython = 0;
        for (int i = 0; i < sentence.length()-5 ; i++){

            if (sentence.substring(i,i+4).equals("java")){
                countJava++;
            }
            if (sentence.substring(i,i+6).equals("python")){
                countPython++;
            }

        }
        if (countJava==countPython){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
}
