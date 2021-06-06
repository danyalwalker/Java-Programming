package day15_logicalops_switch_ternary;

public class NotOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 2;
        if (!(age>7)){
            System.out.println("Need to sit in child car seat.");
        } else {
        System.out.println("must have seat belt in rear row in car. ");
    }
        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed){
            System.out.println("Smoking is not allowed here. Exit");
        }
        boolean isAffordable = true;
        if (!isAffordable){
            System.out.println("Item is affordable");
        } else {
            System.out.println("Item is not affordable");
        }
        String carModel = "Tesla";
        if (!carModel.equals("Tesla")){
            System.out.println("I am not interested in other brands");
        } else {
            System.out.println("I am interested in Tesla");
        }
        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if(!inputPassword.equals(secretPassword)){
            System.out.println("Incorrect Password");}



}}
