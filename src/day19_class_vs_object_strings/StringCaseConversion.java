package day19_class_vs_object_strings;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "New York City";
        String sentence = "New York City is fun!";
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println("New York City".toUpperCase());
        System.out.println(sentence.toUpperCase());

        word.toLowerCase();
        System.out.println(word); // does not change to lower case
        String wordInLCase = word.toLowerCase();
        System.out.println("word"); // now it changes to lower case

        
        word = word.toLowerCase();
        System.out.println("word = " + word); // also now it changes to lower case


        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("java".toUpperCase());



        company = company.toUpperCase();    // change variable company "Amazon" to "AMAZON"
        System.out.println("company = " + company);
    }
}
