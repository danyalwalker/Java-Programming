package OfficeHours.Practice.certification.lambda_practices;

public class Climber {
    public static void main(String[] args) {
         check((h, l) -> h > l,6);
         }
 private static void check(Climb climb, int height) {
         if (climb.isTooHigh(height, 10))
             System.out.println("too high");
        else
             System.out.println("ok");
        }
}
