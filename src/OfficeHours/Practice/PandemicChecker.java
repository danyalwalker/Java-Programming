package OfficeHours.Practice;

import java.util.Scanner;

public class PandemicChecker {
    public static void main(String[] args) {
        System.out.println("Enter the year for pandemic check:");
        Scanner scan = new Scanner(System.in);
        int pandemic = scan.nextInt();
        if (pandemic >= 1346 && pandemic <= 1353) {
            System.out.println("The Black Death");
        } else if (pandemic >= 1665 && pandemic <= 1666) {
            System.out.println("Great Plague of London");
        } else if (pandemic >= 1770 && pandemic <= 1772) {
            System.out.println("Russian plague");
        } else if (pandemic == 1916) {
            System.out.println("American Polio Epidemic");
        } else if (pandemic >= 1918 && pandemic <= 1920) {
            System.out.println("Spanish flu");
        } else if (pandemic >= 2009 && pandemic <= 2010) {
            System.out.println("H1N1 Swine Flu pandemic");
        } else if (pandemic >= 2020 && pandemic <= 2021) {
            System.out.println("COVID-19");
        } else if (pandemic >= 2021 && pandemic <= 0) {
            System.out.println("Invalid year");
        } else {
            System.out.println("No Pandemic");
        }
    }
}
