package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
       /*
        String result;

        if (hourlyRate>45){
            result = "accept";
        } else {
            result = "reject";
        }

         */
        String result = ( hourlyRate > 45)? "accept" : "reject";

        String todaysClass = "java";
        String teacher = (todaysClass.equals("java"))? "Saim|Morodil" : "Nadir";
        System.out.println("teacher = " + teacher);
        
        boolean isEligibleToDrive = false;
        String driving = (isEligibleToDrive)? "have DL, can drive" : "No DL, cannot drive";
        System.out.println("driving = " + driving);

        System.out.println("Enter number:");
        int x = 4;

        x = (x>=5)? x : -x;

        System.out.println(x); // x = -4

    }

}
