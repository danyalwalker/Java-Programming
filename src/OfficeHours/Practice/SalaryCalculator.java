package OfficeHours.Practice;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate, hours per week and weeks: ");
        int hourlyRate = scan.nextInt();
        int weeklyhours= scan.nextInt();
        int weeks= scan.nextInt();
        int salary = hourlyRate * weeklyhours * weeks;

        if(hourlyRate==0){
            System.out.println("Hourly Rate cannot be Negative or Zero");
        } else if(weeklyhours<1 && weeklyhours>65){
            System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
        } else if(weeks<1 && weeks>52){
            System.out.println(" Number of weeks cannot be less than 1 or greater than 52");
        } else {
        System.out.println("salary = " + salary);}


    }

}
