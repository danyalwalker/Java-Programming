package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
         String technologies = "java, html, selenium, cucumber, testng,cucumber, maven";
        System.out.println("technologies.length() = " + technologies.length());
        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("indexOfCucumber = " + indexOfCucumber);
        System.out.println("technologies.charAt(22) = " + technologies.charAt(22));
        technologies.indexOf("SQL"); // when not present, outcome is always -1
        System.out.println("technologies.indexOf(\"SQL\") = " + technologies.indexOf("SQL"));
        System.out.println("technologies.indexOf(\"java\") = " + technologies.indexOf("java"));


    }
}
