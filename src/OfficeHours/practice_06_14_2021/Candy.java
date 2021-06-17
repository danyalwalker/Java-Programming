package OfficeHours.practice_06_14_2021;

/**
 * Create a class Candy [Parent class]
 *
 *     * instance variables:
 *         - brand (String), quantity (int), contains peanuts (boolean),
 *
 *     * static variables:
 *         - number of total candy (int)
 *
 *     * constructor to set all variables
 *         - Also increments total candy every time an object is made
 *
 *     * encapsulate
 *         - Add one set of logic for quantity [ given number cannot be less than 0, otherwise it is not assigned]
 *
 *     * override toString
 *

 *
 *
 *
 */
public class Candy {
    String brand;
    int quantity;
    boolean containsPeanut;
    static int numberOfTotalCandies;

    public Candy(String brand, int quantity, boolean containsPeanut){
        numberOfTotalCandies++;
    }

    public void setQuantity(int quantity){
        if(quantity>0){
            this.quantity = quantity;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", containsPeanut=" + containsPeanut +
                '}';
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
