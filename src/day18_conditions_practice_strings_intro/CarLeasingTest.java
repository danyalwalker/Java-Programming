package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "E";
        double leasePrice = 0.0;
       /*

            leasePrice = 500.0;
        } else if (make.equals("Mercedes") && model.equals("A")){
            leasePrice = 400.0;}
        System.out.println("Make: "+ make);
        System.out.println("Model: "+ model);
        System.out.println("lease price: "+ leasePrice);
         */

        if (make.equals("Mercedes")){
            if(model.equals("E")){
                leasePrice = 500.0;
            } else if (model.equals("A")){
                leasePrice = 400.0;
            }

        }
        System.out.println("Make: "+ make);
        System.out.println("Model: "+ model);
        System.out.println("lease price: "+ leasePrice);
    }
}
