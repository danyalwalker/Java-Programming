package day35_methodParam;
import java.util.Scanner;
public class MultipleParams {
    /**
     * Method name: showSum
     * params/inputs: double num1, double num2
     * it adds numbers and print result
     */
    public static void showSum(double num1, double num2){
        double sum = num1 + num2;
        System.out.println("The sum is :" + sum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two doubles:");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();
        showSum(d1,d2);

        showSum(3.23,5.13);

    }
}
