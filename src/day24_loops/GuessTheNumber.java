package day24_loops;
import java.util.*;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretNumber = scan.nextInt();
        int guessingNumber = 0;

        do {
            System.out.println("Guess the secret number " + guessingNumber);
            guessingNumber++;
        } while(secretNumber == guessingNumber);
        System.out.println("The secret number is " + secretNumber);
    }
}
