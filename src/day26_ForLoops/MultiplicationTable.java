package day26_ForLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num<0 || num>10) {
            System.out.println("Error: Invalid input");
            return; // exit main method
        }


            for (int i = 0; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));}
            /*
             System.out.println(num + " * " + i + " = " + (num * 1));
              System.out.println(num + " * " + i + " = " + (num * 2));
               System.out.println(num + " * " + i + " = " + (num * 3));
                System.out.println(num + " * " + i + " = " + (num * 4));
                 System.out.println(num + " * " + i + " = " + (num * 5));
                  System.out.println(num + " * " + i + " = " + (num * 6));
                   System.out.println(num + " * " + i + " = " + (num * 7));
                    System.out.println(num + " * " + i + " = " + (num * 8));
                     System.out.println(num + " * " + i + " = " + (num * 9));
                      System.out.println(num + " * " + i + " = " + (num * 10));
             */
        }

    }

