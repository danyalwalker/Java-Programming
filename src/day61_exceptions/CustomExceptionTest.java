package day61_exceptions;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int minutes = 30;
        if(minutes > 50){
            throw new BreakTimeException("It is break time");
        }
        System.out.println("let's continue the class");

        double balance = 400.0;
        double itemPrice = 500.0;

        if (itemPrice > balance){
            throw new InsufficientBalanceException("Transaction declined.Not enough funds:(");
        }

        System.out.println("Item succesfully purchased");
    }


}
