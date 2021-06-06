package day07_arithmetic_operators_casting;

public class StringConcatPractice {
    public static void main(String[] args) {

        System.out.println("Java" + 5 + 3);
        System.out.println(5+3);
        System.out.println("Java" + (5+3));
        System.out.println(5 + 3 + "Java");
        System.out.println( 5 + ( 3 + "Java"));

        System.out.println("hello" + 1+2+3);
        System.out.println(("hello" + 1+2+3));
        System.out.println("hello" + (1+2+3));

        String str1 = "hello";
        String str2 = "friends";
        System.out.println( str1 +" " + str2); // space by itself is a character


         int num1 = 7;
         int num2 = 8;
         System.out.println(num1 + num2);
         System.out.println(num1 + "" + 8);


         char char1 = 'a'; // asci table a:97 , b:98
         char char2 = 'b';
         System.out.println(char1 + char2); // result is 195
         System.out.println(char1 + "" + char2);







    }
}
