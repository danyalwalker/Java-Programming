package day36_methods_with_return;

public class Calculator {
    public static double add(double num1, double num2){
        return (num1 + num2);
    }

    public static double subtract(double num1, double num2){
        double result = num1 - num2;
        return result;
    }
    public static double multiply(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }
    public static double divide(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }




    public static void main(String[] args) {
        System.out.println(add(5.3, 4.7));
        System.out.println(add(3, 1));
        System.out.println(subtract(5, 3));
        System.out.println(multiply(2.3, 4.0));
        System.out.println(divide(8.4, 4.0));
    }
}
