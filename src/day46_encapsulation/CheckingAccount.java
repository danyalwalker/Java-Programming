package day46_encapsulation;

public class CheckingAccount {
    private String accountHolder;
    private double balance;
    private String type = "checking"; // we can change using setters if needed
    private long accountNumber;



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    //right click > generate > getter and setter > select all > ok



    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", type='" + type + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                '}';
    }
}
