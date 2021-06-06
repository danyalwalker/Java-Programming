package day20_string_manipulation_methods;

public class StringContains {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.contains("v"));
        System.out.println(word.contains("j"));
        System.out.println(word.contains("a"));
        System.out.println(word.contains("jv"));
        System.out.println(word.contains("va"));

        String company = "Capital One";
        if (company.contains(" ")){
            System.out.println("Company name has multiple words");
        } else {
            System.out.println("Company has single name");}

            String etsyTitle = "Wooden Spoon | Etsy";
            if (etsyTitle.contains(" | ")){
                System.out.println("Title check passed");
            } else {
                System.out.println("Title check failed");
            }

            String firstName = "Ahmet";
            if (firstName.contains("a") && (firstName.contains("e"))){
                System.out.println("both a and e are present");
            } else {
                System.out.println("either a or e, or both are not present");}


            String email = "MURODIL@cybertekschool.com";
            if ( email.toLowerCase().contains("murodil") && email.contains("@") && email.contains("com")){
                System.out.println("possibly murodils email");
            }
        System.out.println((email.substring(email.indexOf("@") +1)).contains("@"));


    }
}
