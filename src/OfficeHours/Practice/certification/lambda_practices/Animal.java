package OfficeHours.Practice.certification.lambda_practices;

/**
 * Functional programming uses lambda expressions to write code. A lambda expression is a block of code that gets passed around.
 * You can think of a lambda expression as an anonymous method. It has parameters and a body just like full-fledged methods do,
 * but it doesn’t have a name like a real method. Lambda expressions are often referred to as lamb- das for short.
 */
public class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;
    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName; canHop = hopper; canSwim = swimmer;
    }
    public boolean canHop() { return canHop; }
    public boolean canSwim() { return canSwim; }
    public String toString() { return species; }

}
