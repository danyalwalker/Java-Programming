package day24_loops;
import java.util.Scanner;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pinCode;
        int secretPinCode = 2344;

        do {
            System.out.println("Enter pin code: " );
                 pinCode = scan.nextInt();
        } while (pinCode != secretPinCode) ;

        System.out.println("Welcome to your account");
    }
}
