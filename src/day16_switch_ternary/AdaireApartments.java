package day16_switch_ternary;

import java.sql.SQLOutput;

/*
add new class AdaireApartments
main method

#### WELCOME TO ADAIRE APARTMENTS ####

numberOfBedrooms = 0, 1, 2

startingPrice = 0;

when numberOfBedrooms 0:
    print: "Studio apartment selected"
    startingPrice -> 1454

when numberOfBedrooms 1:
    print: "One bedroom apartment selected"
    startingPrice -> 1725

when numberOfBedrooms 2:
    print: "Two bedroom apartment selected"
    startingPrice -> 2899

------
"Starting price $1454"
 */
public class AdaireApartments {
    public static void main(String[] args) {
        System.out.println("#### WELCOME TO ADAIRE APARTMENTS ####");
        int numOfBedrooms = 1;
        double startPrice = 0;

        switch(numOfBedrooms){
            case 0:
                System.out.println("This is a studio apartment");
                startPrice = 1454.0;
                break;
            case 1:
                System.out.println("This is a 1 bedroom apartment");
                startPrice = 1725.0;
                break;
            case 2:
                System.out.println("This is a 2 bedroom apartment");
                startPrice = 2899.0;
                break;
            default:
                System.out.println("Unfortunately we do not have " + numOfBedrooms + " bedroom apartment available");
                break;
                //return; --> exits main method


        }
        System.out.println("The starting price of your apartment is " + startPrice);

    }
}
