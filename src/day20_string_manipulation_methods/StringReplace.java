package day20_string_manipulation_methods;

public class StringReplace {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word);
        System.out.println(word.replace("a","U"));

        String sentence = "java strings are fun";
        System.out.println(sentence);
        System.out.println(sentence.replace("a","e"));
        System.out.println(sentence.replace("strings","conditions"));
    }
}
