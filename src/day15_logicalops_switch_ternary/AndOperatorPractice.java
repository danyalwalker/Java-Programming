package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "Wooden Spoon";
        if (onSale && freeShipping){
            System.out.println("Adding to cart - " + itemName);
        } else {
            System.out.println("Continue shopping for good deals on " + itemName);}
        // add to cart only when free shipping, on sale and the item name is Wooden Spoon.

        if (onSale && freeShipping && itemName.equals("Wooden Spoon")){
            System.out.println("Adding to cart - " + itemName);
        } else {
            System.out.println("Continue shopping for good deals on " + itemName);
        }

        // location, salary, remote, benefits

        String location = "New York City";

    }
}
