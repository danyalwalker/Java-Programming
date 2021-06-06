package day19_class_vs_object_strings;
/*
STRING MANIPULATION:
    -> using String methods to process the "value"

add new package day19_class_vs_object_strings
add new class StringComparison
main method

String variable city and assign value

equals()
equalsIgnoreCase()

 */
public class StringComparison {
    public static void main(String[] args) {
        String city = "NYC";
        System.out.println("NYC"); // boolean --> true
        System.out.println(city.equals("nyc")); // Boolean --> outcome is false because it is case sensitive
        System.out.println(city.equalsIgnoreCase("nyc")); // outcome is true, not case sensitive
        System.out.println(city.equalsIgnoreCase("nYc")); // true , not case sensitive
        System.out.println(city.equalsIgnoreCase(("NY c")));// false, cause it's mismatching

        if (city.equals("nyc")){
            System.out.println("won't print this one");
        } else {
            System.out.println("Will print 2nd block, cause it's false");
        }

        if (city.equalsIgnoreCase("nyc")){
            System.out.println("will print first block, cause it's true");
        } else {
            System.out.println(" won't print 2nd row, cause it's true ");
        }
    }
}
