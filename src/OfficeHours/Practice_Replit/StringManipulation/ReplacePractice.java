package OfficeHours.Practice_Replit.StringManipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String str = "breadchickenbread";
        String bread1 = str.substring(0,str.indexOf("bread") + 5);
        System.out.println(str.indexOf("bread"));
    }
}
