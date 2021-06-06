package day24_loops;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'A';
        System.out.println("letter = " + letter);

        while ( letter <= 'Z'){
            System.out.print(letter + " ");
            letter++;
        }
        System.out.println();
        letter = 'Z';
        while ( letter>= 'A'){

            System.out.print(letter + " ");
            letter--;
        }
    }
}
