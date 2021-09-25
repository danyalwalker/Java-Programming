package OfficeHours.Practice.certification.polymorphism;

public class CastingRelation {

}
 class Mammal{}

 class Fish{
     public static void main(String[] args) {
         Fish fish = new Fish();
      //   Mammal mammal = (Mammal)fish; // DOES NOT COMPILE since Mammal and FIsh are unrelated in terms of inheritance
          }
 }

class Rodent{

}
class Capybara extends Rodent {
    public static void main(String[] args) {
        Rodent rodent = new Rodent(); // if object were new Capybara(); this would make rodent an instance of Capybara class, then the casting would work.
        Capybara capybara = (Capybara) rodent; // Throws ClassCastException at runtime since the object being referenced is not an instance of the Capybara class
    }
}