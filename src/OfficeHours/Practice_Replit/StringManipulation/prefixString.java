package OfficeHours.Practice_Replit.StringManipulation;
import java.util.Scanner;
public class prefixString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        String prefix = str.substring(0,n);

        if (str.substring(n).contains(prefix)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}
