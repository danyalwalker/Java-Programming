package OfficeHours.Practice.certification.abstraction;

/**
 * Abstract Class Definition Rules:
 * 1. Abstract classes cannot be instantiated directly.
 * 2. Abstract classes may be defined with any number, including zero, of abstract and non-
 * abstract methods.
 * 3. Abstract classes may not be marked as private or final.
 * 4. An abstract class that extends another abstract class inherits all of its abstract methods as its own abstract methods.
 * 5. The first concrete class that extends an abstract class must provide an implementation for all of the inherited abstract methods.
 */
public abstract class Animal {
    protected int age;
    public void eat() {
        System.out.println("Animal is eating");
    }
    public abstract String getName();
}
