package day19_class_vs_object_strings;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek"; // not case sensitive
        String expPassword = "Abc123";  // case sensitive

        String userName = "CYBERTEK ";
        String password = "ABC123";

        if ( expUserName.equalsIgnoreCase(userName)){ // Nested if statement, it also could be dona with &&
            if(expPassword.equals(password)){
            System.out.println("User successfully logged in");
            } else {
                System.out.println("Invalid Username or Password");
        }
    } else {
            System.out.println("Invalid Username or Password");
}}}
