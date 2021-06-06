package day36_methods_with_return;
import java.util.*;
public class Info {
    public static String fullName(){
        System.out.println("Inside fullname method");
       return "Daniel Walker";
    }
    public static boolean isMarried(){
        return true;
    }
    public static int getAge(){
        return 28;
    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }

    public static void main(String[] args) {
        System.out.println(fullName());
        System.out.println(isMarried());
        System.out.println(getAge());
        System.out.println(getRandomYear());

        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();
    }
}
