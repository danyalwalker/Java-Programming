package OfficeHours.Practice_Replit;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Grader!");
        String subject1 = scan.next();
        double grade1 = scan.nextDouble();
        System.out.println("Please enter subject name number 1 and score for this subject\n" + subject1 + "\n" + grade1);
        String subject2 = scan.next();
        double grade2 = scan.nextDouble();
        System.out.println("Please enter subject name number 2 and score for this subject\n" + subject2 + "\n" + grade2);
        String subject3 = scan.next();
        double grade3 = scan.nextDouble();
        System.out.println("Please enter subject name number 3 and score for this subject\n" + subject3 + "\n" + grade3);
        String subject4 = scan.next();
        double grade4 = scan.nextDouble();
        System.out.println("Please enter subject name number 4 and score for this subject\n" + subject4 + "\n" + grade4);
        String subject5 = scan.next();
        double grade5 = scan.nextDouble();
        System.out.println("Please enter subject name number 5 and score for this subject\n" + subject5 + "\n" + grade5);

        System.out.print("Summary: " + subject1 + "-" + grade1 + ", ");
        System.out.print(" " + subject2 + "-" + grade2 + ",");
        System.out.print(" " + subject3 + "-" + grade3 + ",");
        System.out.print(" " + subject4 + "-" + grade4 + ",");
        System.out.println(" " + subject5 + "-" + grade5 );
        System.out.println("Your average score is: " + (grade1+grade2+grade3+grade4+grade5)/5);

    }
}


