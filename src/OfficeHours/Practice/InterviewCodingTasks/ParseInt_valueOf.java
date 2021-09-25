package OfficeHours.Practice.InterviewCodingTasks;

public class ParseInt_valueOf {
    static String number;
    public static void main(String[] args) {
        System.out.println("Integer.parseInt(\"25\") = " + Integer.parseInt("25"));
        System.out.println("Integer.valueOf(\"25\") = " + Integer.valueOf("25"));
        System.out.println("Integer.valueOf(25) = " + Integer.valueOf(25));
        // System.out.println(Integer.parseInt(25)); compile error
       // System.out.println("Integer.parseInt(\"abc\") = " + Integer.parseInt("abc")); //NumberFormatException
        //System.out.println(Integer.parseInt(number)); // NumberFormatException since number is not assigned any value, it might not be number format
        float num = 6.7F;
        StringBuilder sb = new StringBuilder("abcdefg");
        System.out.println(sb.substring(4, 3));
    }
}
