package day35_methodParam;

public class BuildingEmail {

    public static void buildEmail(String name, String domain){
        System.out.print("The email is: " + name + "@" + domain + ".com");
    }

    public static void main(String[] args) {

        buildEmail("halil", "verizon");
    }
}
