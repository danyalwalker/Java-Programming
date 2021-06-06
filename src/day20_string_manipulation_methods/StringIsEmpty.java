package day20_string_manipulation_methods;

public class StringIsEmpty {
    public static void main(String[] args) {
        // isEmpty() --> checks if it's empty "", returns boolean (true/false)

        String car = "Audi";
        System.out.println(car.isEmpty()); // false - not empty

        String city = "";
        System.out.println(city.isEmpty()); // true - empty
        String jobTitle= "";
        System.out.println(jobTitle.equals(""));
        System.out.println(jobTitle.length() == 0);
        System.out.println("".equals(jobTitle));
    }
}
