package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int explast4SSN = 2345;
        int exppinCode = 1234;

        int last4SSN = 2345;
        int pinCode = 2315;
        if (last4SSN == explast4SSN  && pinCode == exppinCode){
            System.out.println("Authentication Successful");
        } else {
            System.out.println("Authentification Unsuccessful");
            if (last4SSN != explast4SSN ){
                System.out.println("last 4 SSN is incorrect");
            }
            if (pinCode != exppinCode){
                System.out.println("pin code is not correct");
            }

        }
    }
}
