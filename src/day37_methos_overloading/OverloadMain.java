package day37_methos_overloading;

import java.util.Arrays;

public class OverloadMain {
    public static void main(String[] args) {
        System.out.println("Hello from real main method");
        main(10);
        System.out.println(Arrays.toString(args));
    }

    /**
     * overloading main method:
     * same name + different parameter
     * JDK does not look for this one to run.
     */

    public static void main(int num) {
        System.out.println("num: " + num);

    }
}
