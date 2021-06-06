package day32_arrays_split;

public class SplitSentence {
    public static void main(String[] args) {
        String sentence = "today I am coding java arrays";
        String[] wordsInSentence = sentence.split(" ");
        System.out.println("Number of words in this sentence is " + sentence.split(" ").length);
        System.out.println("Number of words in this sentence is " + wordsInSentence.length);

        for (String each: wordsInSentence) {
            System.out.println(each);
        }

        String googleResult = "about 1,810,000 results (0.68 seconds)";
        String[] results = googleResult.split(" ");
        System.out.println("Count = " + results[1]);
        System.out.println("seconds = " + results[3].replace("(",""));


    }
}
