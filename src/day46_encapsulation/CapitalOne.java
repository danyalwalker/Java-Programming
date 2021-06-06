package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.setAccountHolder("Someone");
        account.setAccountNumber(12134234564L);
        account.setBalance(1234.12);
        account.setType("360 Checking");

        System.out.println(account);
    }


}
