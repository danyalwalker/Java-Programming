package OfficeHours.Practice.certification.polymorphism;

public abstract class BigCat {
    protected  void purr() { System.out.println("BigCat purrs!"); }
   public static void main(String[] args) {
         BigCat bigCat = new Ocelot();
         bigCat.purr();
         }
}
class Ocelot extends BigCat {
  protected  void purr() { System.out.println("Ocelot purrs!"); }
 }
