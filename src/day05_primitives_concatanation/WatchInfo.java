package day05_primitives_concatanation;

import javax.management.relation.RoleNotFoundException;

public class WatchInfo {
    public static void main(String[] args){
        // brand, color, price, waterResistant, isSmart, gender (M/F/U)
        String brand = "Rolex";
        String color = "white";
        double price = 1249.00;
        boolean waterResistant = true;
        boolean isSmart = false;
        char gender = 'U';

        System.out.println("Brand: "+ brand);
        System.out.println("Color: " + color);
        System.out.println("Is water resistant?\t" +waterResistant);
        System.out.println("is it smart?\t"+ isSmart);
        System.out.println("Gender:" +gender);
    }
}
