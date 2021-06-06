package OfficeHours.Practice_Replit.Methods;
import java.util.*;
public class StringCover {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString(String main, String coverME) {
        String result="";
        if(!main.contains(coverME)){
            result = "[" + main + "]";
        } else {
            result = main.replaceAll(coverME, "[" + coverME + "]");
        }

        return result;

    }
}
