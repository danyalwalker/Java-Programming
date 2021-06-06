package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city1 = "Moscow";
        String city2 = "New York";
        if ( city1.equals("Moscow")||city2.equals("Tampa")){
            System.out.println("Willing to relocate");
        } else {
            System.out.println("Not considering to move");
        }

        String teacher = "Gurhan";
        if ( teacher.equals("Saim")||teacher.equals("Murodil")){
            System.out.println("it's a java class with " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft skills with " + teacher);
        } else {
            System.out.println("It's another class at Cybertek school with " + teacher);
        }

        // company - "google" or salary >= 100K --> accept offer
        String company = "NadirTech";
        double salary = 105_000.0;
        if ( company.equals("Google") || salary >= 100_000.0){
            System.out.println("Accepting offer from " + company);
        } else {
            System.out.println("Rejecting offer from " + company);
        }
    }
}
