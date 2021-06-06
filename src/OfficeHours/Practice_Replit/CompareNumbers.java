package OfficeHours.Practice_Replit;
import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if ((a-b)>0){
            System.out.println( a + " is greater");
        } else if ((a-b)<0) {
            System.out.println( b + " is greater");
        } else {
            System.out.println( "They're equal.");
        }

        int num = s.nextInt();

        if ( num == 0){
            System.out.println("zero");
        } else if ( num > 0){
            System.out.println ("positive");
        } else if (num < 0) {
            System.out.println("negative");
        }


    }
    }
