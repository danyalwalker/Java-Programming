package day35_methodParam;

public class MethodsWithParams {

    public static void displayValue(int num) {
        System.out.println("value is " + num);
    }

    public static void main(String[] args) {
        displayValue(5);
        displayValue(3);
        displayValue(12);
        int count = 55;
        displayValue(count);

        greetByName("Ekrem");
        greetByName("Halil");
        String nam = "Edip";
        greetByName(nam);
    }

    /**
     * method name: greetByName
     * param/input: String name
     * It prints "Hello "name" how are you today?
     */
    public static void greetByName(String name) {
        System.out.println("Hello " + name + ", how are you today?");
    }
}
