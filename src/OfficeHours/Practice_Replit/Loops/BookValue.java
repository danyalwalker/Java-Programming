package OfficeHours.Practice_Replit.Loops;
import java.util.Scanner;
public class BookValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of chapters of the book: ");
        int chapters = input.nextInt();
        int value = 0;
        for (int i = 1; i <= chapters; i++) {
             value += 10;
        }
        System.out.println("Value of the book: " + value);
    }
}
