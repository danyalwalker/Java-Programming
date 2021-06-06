package day25_loops;

public class PrintEvenOfOddNumbers {
    public static void main(String[] args) {
        /*
        1. print all even numbers between 1-100
        2.print all odd numbers between 1-100
         */
        System.out.println("Even numbers 0 - 100: ");
        for (int n = 0; n <= 100; n++) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }

        }
        System.out.println("\nEven numbers 0 - 100: ");
        for (int k = 0; k <= 100; k++) {
            if (k % 2 == 1) {
                System.out.print(k + " ");
            }

        }

    }
}
