package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        /*
        declare 3 variable,
        currentSpeed --> 45
        speedLimit --> 55
        isSpeeding --> true if speeding
         */
   int currentSpeed = 45;
   int speedLimit = 55;
   boolean isSpeeding = currentSpeed > speedLimit;
   System.out.println(" Are you speeding?  " + isSpeeding);

   currentSpeed += 20; //45+20 = 65
   isSpeeding = currentSpeed > speedLimit;
   System.out.println(" Are you speeding?  " + isSpeeding);

   double accountBalance = 250.25;
   double itemPrice = 100;
   boolean canAfford = accountBalance >= itemPrice;
   System.out.println("Can I afford it? " + canAfford);

   itemPrice += 160;
   canAfford = accountBalance >= itemPrice;
   System.out.println("Can I afford it? " + canAfford);




    }
}
