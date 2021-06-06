package day29_NestedLoops;

public class StarsNestedLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
