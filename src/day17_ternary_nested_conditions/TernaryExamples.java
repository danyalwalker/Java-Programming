package day17_ternary_nested_conditions;
import java.util.Scanner;
public class TernaryExamples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();



    x = (x>=5)? x : -x;
        System.out.println(x);

        System.out.println("Enter number1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number2:");
        int num2 = scan.nextInt();

        num2 = (num2>num1)? num2:num1;
        System.out.println(num2);

    }

}
