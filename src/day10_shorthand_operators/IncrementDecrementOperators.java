package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i++;
        i++;
        ++i;
        ++i;

        System.out.println("i = " + i);

        int LinesOfCode = 15;
        System.out.println("LinesOfCode = " + LinesOfCode);
        LinesOfCode=LinesOfCode + 1;
        LinesOfCode+=1;
        LinesOfCode++;
        ++LinesOfCode;
        System.out.println("LinesOfCode = " + LinesOfCode);

        
        LinesOfCode=LinesOfCode - 1;
        LinesOfCode-=1;
        LinesOfCode--;
        --LinesOfCode;
        System.out.println("LinesOfCode = " + LinesOfCode);
        
        char letter = 'A';
        letter+=1;
        System.out.println("letter = " + letter);
        


    }
    
}
