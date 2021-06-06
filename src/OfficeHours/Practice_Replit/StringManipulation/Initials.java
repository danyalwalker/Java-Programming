package OfficeHours.Practice_Replit.StringManipulation;

public class Initials {
    public static void main(String[] args) {
        String fullName = "James Bond";
        String firstName = fullName.substring(0,1);
        String lastName = fullName.substring(fullName.indexOf(" "),fullName.indexOf(" ") + 2);
        fullName = firstName + lastName;
        System.out.println(fullName);
    }
}
