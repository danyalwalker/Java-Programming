package OfficeHours.Practice.certification.pass_by_value;
/**
 * Java is a “pass-by-value” language.
 * This means that a copy of the variable is made and the method receives that copy.
 * Assignments made in the method do not affect the caller.
 */
public class PassPrimitives {
     public static void main(String[] args) {
         int num = 4;
         newNumber(5);

        System.out.println(num); // 4
          }
        public static void newNumber(int num) {
         num = 8;
            System.out.println("num = " + num);
        }
}
