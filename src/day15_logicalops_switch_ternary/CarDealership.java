package day15_logicalops_switch_ternary;

public class CarDealership {
    public static void main(String[] args) {
        double budget = 5000.0;
        String model = "Tesla";
        double carPrice = 4999.0;
        if (carPrice <= budget && (model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla"))){
            System.out.println("ready to purchase model " + model + ", price = " + carPrice);
        } else {
            System.out.println("Not interested in model = " + model + " price = " + carPrice);
        }
    }
}
