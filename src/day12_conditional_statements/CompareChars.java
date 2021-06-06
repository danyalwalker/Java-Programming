package day12_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'A';
        char letter2 = 'J';
        System.out.println(letter1 == letter2); //65 == 74
        System.out.println(letter1>letter2);
        System.out.println(letter1<letter2);

        char grade = 'D';
        boolean pass = grade <= 'D';
        System.out.println("Did you pass the exam? " + pass);


    }
}
