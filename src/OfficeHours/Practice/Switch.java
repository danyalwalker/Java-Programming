package OfficeHours.Practice;

public class Switch {
    public static void main(String[] args) {
        String houseOccupants = "Apartment";
        int occupants = 0;
        switch (houseOccupants) {
            case "Tree house":
                occupants = 1;
                break;
            case "Mobile home":
                occupants = 2;
                break;
            case "Apartment":
                occupants = 4;
                break;
            case "Town house":
                occupants = 6;
                break;
            case "Villa":
                occupants = 8;
                break;
            case "Mansion":
                occupants = 10;
                break;

        }
        System.out.println(occupants);

        String day = "Saturday";
        switch(day){
            case "Monday": case "Tuesday": case "Wednesday":
                System.out.println("Office hours at 5:30 - 6:45 EST");
                break;
            case "Thusrday":
                System.out.println("Soft Skills day");
                break;
            case "Friday":
                System.out.println("day off");
                break;
            case "Saturday": case "Sunday":
                System.out.println("Already a long day, no office hours");
                break;
            default:
                System.out.println("invalid day given");
        }

        byte gradeLevel = 13;
        switch(gradeLevel){
            case 1 : case 2 : case 3 : case 4 : case 5 :
                System.out.println("Elementary");
                break;
            case 6 : case 7 : case 8 :
                System.out.println("Middle School");
                break;
            case 9 : case 10 : case 11 : case 12 :
                System.out.println("High School");
                break;
            case 13 : case 14 : case 15 : case 16 :
                System.out.println("College");
                break;
            case 17 : case 18 :
                System.out.println("Grad School");
                break;
            default:
                System.out.println("Invalid grade level given");
        }

    }
}
