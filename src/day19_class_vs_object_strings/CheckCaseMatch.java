package day19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "usa";
        if (countryCode.equals(countryCode.toUpperCase())){ // countryCode.equals("USA")
            System.out.println("Country code is all upper case: " + countryCode);
        } else {
            System.out.println("Country code is not all upper case: " + countryCode);
        }
    }
}
