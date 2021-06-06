package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        // location, salary, remote, hasBenefits

        String location = "New York City";
        double salary = (100_000.00 );
        boolean isRemote = true;
        boolean hasBenefits = false;

        if (isRemote && hasBenefits && salary >= 100_000.00 && location.equals("New York City")){
        System.out.println("I will take the offer.");
    } else {
            System.out.println("Sorry, your terms does not meet my standards. Is it negotiable?");
        }
}}
