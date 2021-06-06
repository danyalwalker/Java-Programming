package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","lab"));
        System.out.println("word = " + word);

        word = word.replace("hub","lab");
        System.out.println("word = " + word);
        System.out.println(word.replace('i','o')); // replace i and o
        System.out.println(word.replace('i','o').replace('a','i')); // replace i and o && replace a and i

        String sentence = "java is fun";
        String withNoSpaces = sentence.replace(" ","");
        System.out.println("withNoSpaces = " + withNoSpaces);
        // java to selenium , fun to "a lot of fun" --> no spaces
        String selenium = sentence.replace("java","selenium").replace(" ","").replace("fun","alotoffun");
        System.out.println(selenium);

        String result = "1-48 of over 400 results for java book";
        result = result.replace("1-48 of over ","");
        System.out.println(result);
        result = result.replace(" results for java book","");
        System.out.println(result);
        
        String sandwich = "breadjambread";
        sandwich = sandwich.replace("bread","");
        System.out.println("sandwich = " + sandwich);
    }
}
