package day25_loops;

public class FizzBuzz {
    public static void main(String[] args) {

        for (int n = 0; n <= 100; n++){
            if (n % 5 == 0 && n % 3 == 0) {
                System.out.println(n + " FizzBuzz ");
            }
        }
    }
}
