package OfficeHours.Practice.certification.pass_by_value;

/**
 * Java is a “pass-by-value” language.
 * This means that a copy of the variable is made and the method receives that copy.
 * Assignments made in the method do not affect the caller.
 */
public class PassStrings {
    public static void main(String[] args) {
        String name = new String();//"";
        speak(name);
        System.out.println(name.length());
    }
    public static void speak(String name) {
        name = "Sparky";
        System.out.println("name = " + name);}
}
