package day39_wrapper_clsases;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(10,5));
        System.out.println(Integer.min(10,5));
        System.out.println("min Int: " + Integer.MIN_VALUE);
        System.out.println("max Int: " + Integer.MAX_VALUE);

        System.out.println("Min Double: " + Double.max(12.1, 32.23));
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);

        System.out.println(Double.compare(10.1, 10.2));
        System.out.println(Double.compare(10.3, 10.2));
        System.out.println(Double.compare(10.1, 10.1));

        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isDigit('c'));
        System.out.println(Character.isAlphabetic('w'));
        System.out.println(Character.isUpperCase('w'));
        System.out.println(Character.isLetter('w'));

        String word = " JaVa IS Fun";
        for (int i = 0; i < word.length() ; i++) {
            if(Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i));
            }

            System.out.println(Boolean.TRUE);
        }


    }
}
