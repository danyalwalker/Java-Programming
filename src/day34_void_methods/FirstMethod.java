package day34_void_methods;
import java.util.*;
public class FirstMethod {
    public static void main(String[] args) {
        displayYourMessage(); // call the method
        displayYourMessage(); // 2nd call to method
        displayYourMessage(); // 3rd call
    }
    // first custom reusable method!
    public static void displayYourMessage() {
        System.out.println("Hello Group 19!");
    }

    public static void cube(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print(n*n*n);
    }
}
