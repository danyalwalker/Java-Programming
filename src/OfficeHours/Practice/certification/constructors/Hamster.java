package OfficeHours.Practice.certification.constructors;

public class Hamster {
    private String color; private int weight;
    public Hamster(int weight) {
        //this() has one special rule you need to know.
        // If you choose to call it, the this() call must be the first noncommented statement in the constructor.
        this(weight, "brown");
        this.weight = weight;
        color = "brown"; }
    public Hamster(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public static void main(String[] args) {
        Hamster hamster = new Hamster(14);
        System.out.println("hamster.color = " + hamster.color);
        System.out.println("hamster.weight = " + hamster.weight);

        hamster.weight = 12;
        System.out.println("hamster.weight = " + hamster.weight);
    }
}
