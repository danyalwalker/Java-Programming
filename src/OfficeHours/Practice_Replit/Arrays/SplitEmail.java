package OfficeHours.Practice_Replit.Arrays;
import java.util.*;
public class SplitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below

        if (email.contains("@") && !(email.substring(email.indexOf("@") +1)).contains("@")){
            String[] splitEmail = email.split("@");
            System.out.println("Email id: " + splitEmail[0]);
            System.out.println("Email domain: " + splitEmail[1]);
        } else {  System.out.println("invalid email"); }

    }
}
