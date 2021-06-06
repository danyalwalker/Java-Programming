package OfficeHours.Practice_Replit.StringManipulation;
import java.util.Scanner;
public class SandwichString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if (str.contains("bread")){
            String bread1 = str.substring(0,str.indexOf("bread") + 5);
            str = str.replace(bread1,"");
            if (str.contains("bread")){
                String bread2 = str.substring(str.indexOf("bread"));
                str = str.replace(bread2,"");
                System.out.println(str);
            }else{
                System.out.println("nothing");
            }

        } else{
            System.out.println("nothing");
        }
            }
        }





