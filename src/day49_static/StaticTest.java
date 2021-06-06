package day49_static;

public class StaticTest {

    String word = "java";
    static String word2 = "static";

    public static void main(String[] args) {

        //static method can be called using classname
        StaticMethods.displayMessage("wooden spoon");

        //instance method needs an object to be called

        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();

        // static methods can only acces other static variables and methods

        //System.out.println(word); --> Error since instant is not static

        System.out.println(word2);
    }
}
