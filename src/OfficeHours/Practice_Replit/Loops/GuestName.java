package OfficeHours.Practice_Replit.Loops;
import java.util.Scanner;
public class GuestName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String guestName = "", yesorno = "",guestListReport = "";
        for(int i=100; i>1; i++){
            System.out.println("Please enter guest name:");
            guestName = input.next();
            System.out.println("Do you want to enter new guest name:");
            yesorno = input.next();
            guestListReport += guestName + ", ";
            if (yesorno.equals("no")){
                break;
            }

        }
        int g = guestListReport.length();
        System.out.print("Guest's list: " + guestListReport.substring(0,g-2));
    }
}
