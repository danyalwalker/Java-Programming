package OfficeHours.Practice.certification.inheritance;

public class Chimpanzee extends Ape{
    public Chimpanzee(){
        System.out.println("Chimpanzee"); // It call the super class Ape constructor before the print statement
    }
    public static void main(String[] args) {
        new Chimpanzee(); }
}
class Primate {
    public Primate() {
    System.out.println("Primate"); }
}
class Ape extends Primate {
    public Ape() {
        System.out.println("Ape"); // It call the super class Primate constructor before the print statement
    }
     }
