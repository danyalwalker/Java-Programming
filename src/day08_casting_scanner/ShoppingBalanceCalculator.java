package day08_casting_scanner;

    public class ShoppingBalanceCalculator {
        public static void main(String[] args) {
            double balance = 345.55, price1 = 20.88, price2 = 89.99, price3 = 15;

            System.out.println( "Your remaining balance is " + ( balance -( price1 + price2 + price3)));

            double remainingBalance = balance - (price1 + price2 + price3);
            System.out.println("Your remaining balance is $" + remainingBalance);
            balance = remainingBalance;
            System.out.println(balance);

            int balanceNoChange = (int)remainingBalance;
            System.out.println(balanceNoChange);
            System.out.println( " Your remaining balance with no change: $" + balanceNoChange);





        }
    }

