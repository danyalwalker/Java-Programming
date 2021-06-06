package day24_loops;
import java.util.Scanner;
public class CountUntil {
    public static void main(String[] args) {
        int count, number;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number to count until: ");
        int numberToStop = keyboard.nextInt();
        int start =1;

        while ( start <= numberToStop){
            System.out.print(start + " ");
            start++;
        }

    }
}
