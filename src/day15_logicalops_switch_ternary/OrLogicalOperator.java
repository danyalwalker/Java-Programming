package day15_logicalops_switch_ternary;

import java.sql.SQLOutput;

public class OrLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true = " + (true||true));
        System.out.println("true || false = " + (true||false));
        System.out.println("false || true = " + (false||true));
        System.out.println("false || true = " + (false||false));

        int apples = 5;
        int oranges = 6;

        System.out.println(apples > 3 || oranges > 4);

        if (apples > 3 || oranges > 4){
            System.out.println(" No need to buy fruits today!");
        } else {
            System.out.println("Need to go get some fruits.");
        }
        if (apples == 0 || oranges == 0 ){
            System.out.println(" No need to buy fruits today!");
        } else {
            System.out.println("Need to go get some fruits.");

        }
    }
}
