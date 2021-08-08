package OfficeHours.Practice.certification.static_members;

public class Gorilla {
    public static int count;
    public static void addGorilla() { count++; }
    public void babyGorilla() { count++; }
    public void announceBabies() {
        addGorilla();
        babyGorilla(); }
    public static void announceBabiesToEveryone() {
        addGorilla();
      //  babyGorilla(); // DOES NOT COMPILE
        Gorilla gorilla = new Gorilla();
        gorilla.babyGorilla();
    }
    Gorilla gorilla = new Gorilla();
    public int total;
   // public static int average = total / count; // DOES NOT COMPILE
  // public static int average = gorilla.total/count; // DOES NOT COMPILE
}
