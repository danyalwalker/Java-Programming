package day17_ternary_nested_conditions;
/*
add new class VendingNestedIf
add main method

selection = "drink" orr can be "snack"
drink = "tea" , "coke"
snack = "chips" , "candy"

when selection is "drink":
    "drink option is selected"

    when drink is "tea":
        "tea is selected"
    when drink is "coke":
        "coke is selected"
when selection is "snack"
    "snack option is selected"

    when snack is "chips":
        "chips item is selected"
    when snack is "candy":
        "candy item is selected"

 */
public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "drink";
        String drinkItem = "coke";
        String snackItem = "candy";
        if (selection.equals("drink")) {
            System.out.println("drink option is selected");
            if (drinkItem.equals("tea")) {
                System.out.println("tea selected");
            } else {
                System.out.println("coke");
            }
        } else if (selection.equals("snack")) {
            System.out.println("snack option is selected");
            if (snackItem.equals("chips")){
                System.out.println("chips selected");
            } else {
                System.out.println("Candy is selected");}
            }
        }
    }
