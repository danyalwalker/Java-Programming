package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for(int stars = 1;
            stars <= 15;
            stars++){
            System.out.print("\uD83C\uDF1F ");
        }

        String myStars = "";
        // for loop: fill 5 stars to myStars variable.
        for(int i = 0; i<=5; i++){
          myStars += "* ";
            System.out.println("my stars = " + myStars);
        }
    }
}
