package day37_methos_overloading;
// What is the difference between procedure and function?
// procedure -> does not return a value, just executes a block of code. in java we call them Void Methods.
// Function returns a value, executes blocks of code and returns a certain value. in java we call them methods with return or non void methods.

public class WarmUpMethod {
    /**
     * method:
     *     loginVoid
     * params:
     *     String username, String password
     *
     * return type:
     *     VOID
     *
     * in the method:
     *     Declare : String secretUsername ="cybertekStudent", secretPassword = "abc123"
     *
     * if(both match)
     *     PRINT:
     *         Login Successful, welcome cybertekStudent
     * ELSE
     *     PRINT:
     *         Incorrect username or password
     * @return
     */
    public static void loginVoid(String username, String password){
        String secretUserName = "cybertekStudent";
        String secretPassword = "abcd123";
        if(username.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)){
            System.out.println("login Successful, welcome to cybertek school");
        } else {
            System.out.println("incorrect username or method");
        }
    }

    public static void main(String[] args) {
        loginVoid("Cybertekstudent", "abcd123"); //positive test or sunny day
        loginVoid("cybertek","answer"); // negative test or rainy day
       // System.out.println(loginVoid("Cybertekstudent", "abcd123")); Error because Void - no return value
        System.out.println(login("Cybertekstudent", "abcd123"));
        if(login("Cybertekstudent", "abcd123")){
            System.out.println("login successful, welcome to canvas");
        }else{
            System.out.println("login failed");
        }
        boolean isLoginSuccess = login("nadir","mountain");
        System.out.println("isLoginSuccess = " + isLoginSuccess);

        if(isLoginSuccess){
            System.out.println("login successful, welcome to canvas");
        }else{
            System.out.println("login failed");
        }
    }

    public static boolean login(String username, String password){
        String secretUserName = "cybertekStudent";
        String secretPassword = "abcd123";
      //  return (username.equalsIgnoreCase(secretUserName) && password.equals(secretPassword))
        if(username.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)){
            return true; // return true and exit method here. return false will not run.
        }
            return true;


    }
}
