package OfficeHours.Practice.certification.pass_by_value;
/**
 * Java is a “pass-by-value” language.
 * This means that a copy of the variable is made and the method receives that copy.
 * Assignments made in the method do not affect the caller.
 */
public class PassStringBuilder {
    public static void main(String[] args) { 
        StringBuilder name = new StringBuilder();
        speak(name);
        System.out.println(name); // Webby
    }
    public static void speak(StringBuilder s) {
        s.append("Webby");
        System.out.println("s = " + s);}
}
