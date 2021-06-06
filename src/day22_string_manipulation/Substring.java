package day22_string_manipulation;

public class Substring {
    public static void main(String[] args) {
       String word = "hello";
        System.out.println(word.substring(0, 2));
        System.out.println(word.substring(1, 4));
        System.out.println(word.substring(2, 4));

        String name = "Ekrem Cakar";
        System.out.println(name.substring(0, 6));
        System.out.println(name.substring(6, 11));
        System.out.println(name.substring(6));
    }
}
