package OfficeHours.Practice_Replit.Loops;
import java.util.*;
public class CountHi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count = 0;
        String j = "", a = "";
        for(int i=0; i<=str.length()-2; i++){
            if( (str.charAt(i) + "" + str.charAt(i+1)).equals("hi")){
                count++;

                }
            }


        System.out.print(count);
    }
}
