package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter ='u';
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == letter){
                index = i;
                System.out.println("Index of letter " + letter + " is " + index);
                break;
            }
            
        }
        if ( index == -1) {
            System.out.println("letter is not found");
        }
    }
}
