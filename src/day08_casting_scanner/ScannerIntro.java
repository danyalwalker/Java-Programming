package day08_casting_scanner;
/*
STEPS TO USE SCANNER CLASS
1) type on top of the class: we need import Scanner class into our class.
    import java.util.Scanner;
2) Create Scanner Object using new keyboard.
    Scanner scan = new Scanner(System.in);
3) Ask a question:
System.out.println("Please enter your name:");
4)
Capture the typed keyboard input value into variable


 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String firstName = scan.next();

        System.out.println("nice to meet you, " + firstName);
    }
}
