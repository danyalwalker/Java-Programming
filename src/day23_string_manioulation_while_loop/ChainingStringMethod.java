package day23_string_manioulation_while_loop;

public class ChainingStringMethod {
    public static void main(String[] args) {
        String word = "hello world";
        System.out.println(word.toUpperCase().replace(" ", "|").equals("hello|world"));
        System.out.println(word.toUpperCase().replace(" ", "|").equals("HELLO|WORLD"));

        String title = "woo den sp oon";
        System.out.println(title.replace(" ", "").toUpperCase());

        String city = "chicago"; // Make first letter upper case
        System.out.println((city.substring(0, 1).toUpperCase() + city.substring(1)));

        String city2 = "ISTANBUL";
        System.out.println(city2.substring(0, 1) + city2.substring(1).toLowerCase());
        System.out.println(word.charAt(word.length() - 1));
    }
}
