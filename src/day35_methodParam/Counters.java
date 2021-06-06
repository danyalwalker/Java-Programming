package day35_methodParam;
public class Counters {
    /**
     * method name:
     * -count
     * -input: int num
     * it prints from 0 to that num in same line
     */

    public static void count(int num){

        for (int i = 0; i <= num; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        count(5);
        count(8);

        String word = "wooden spoon";
        count(word.length());
        printAge(1979);
    }
    /**
     * method name: printAge
     * param/input: int year
     * Birth year: 1984, Age: 38
     */
    public static void printAge(int year){
        int age = 2021 - year;
        System.out.println("Birth year: " +year+ ". Age: " +age);
    }
}
// I make sure the code I write is maintainable and reusable, by writing many custom methods with parameters for different programming and automation purposes.