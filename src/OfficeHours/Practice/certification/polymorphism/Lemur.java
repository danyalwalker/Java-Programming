package OfficeHours.Practice.certification.polymorphism;

/**
 * In polymorphism
 * 1. The type of the object determines which properties exist within the object in memory.
 * 2. The type of the reference to the object determines which methods and variables are accessible to the Java program.
 */
public class Lemur extends Primate implements HasTail{

    public boolean isTailStriped() {
        return false; }

    public int age = 10;

    public static void main(String[] args) {

        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        System.out.println("lemur.isTailStriped() = " + lemur.isTailStriped());
        System.out.println("lemur.hasHair() = " + lemur.hasHair());

        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());


        Primate primate = lemur;
        System.out.println(primate.hasHair()); }

    public static void practice(){
        Primate primate = new Lemur();
        Lemur lemur = (Lemur)primate;
        lemur.age = 15;
        System.out.println(lemur.age);
    }
    /**
     * 1. Casting an object from a subclass to a superclass doesn’t require an explicit cast.
     * 2. Casting an object from a superclass to a subclass requires an explicit cast.
     * 3. The compiler will not allow casts to unrelated types.,
     * 4. Even when the code compiles without issue, an exception may be thrown at runtime if the object being cast is not actually an instance of that class.
     */

    Object email;
    String gmail =(String)email;

}
