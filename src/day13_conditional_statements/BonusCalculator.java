package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        int bonus = 0;
        double salesAmount = 2000.55;
        if (salesAmount <= 1000) {
            System.out.println("Good job! You qualified for bonus.");
            bonus = 50;
            System.out.println("Your bonus is $" + bonus);
        } else {
            System.out.println("Great job! You qualified for full bonus.");
            bonus = 100;
            System.out.println("Your bonus is $" + bonus);
        }
    }
}
