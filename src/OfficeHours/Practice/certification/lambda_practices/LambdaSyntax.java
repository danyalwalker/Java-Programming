package OfficeHours.Practice.certification.lambda_practices;

/**
 * Lambda expressions, or lambdas, allow passing around blocks of code.
 * The full syntax looks like (String a, String b) -> { return a.equals(b); }.
 * The parameter types can be omitted. When only one parameter is specified without a type, the parentheses can also be omitted.
 * The braces and return statement can be omitted for a single statement, making the short form (a -> a.equals(b).
 * Lambdas are passed to a method expecting an inter- face with one method.
 */
public class LambdaSyntax {
    public static void main(String[] args) {
        String name = "Daniel";
        char symbol = '!';


        MyInterface myInterface = (a, b) -> System.out.println("Hello World!");

        MyInterface myInterface2 = (a, b) -> {
            System.out.println("Hello World!");
            System.out.println("Hi"+ a + b);
        };

        myInterface.message(name,symbol);

        myInterface2.message(name,symbol);
    }

}
