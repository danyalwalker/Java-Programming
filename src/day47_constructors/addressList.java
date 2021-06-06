package day47_constructors;

public class addressList {
    public static void main(String[] args) {
        Address myAddress = new Address();
        myAddress.setStreet("172 Suffolk ave");
        myAddress.setCity("Staten Island");
        myAddress.setState("New York");
        myAddress.setZipCode("10314");
        myAddress.setCountry("United States");

        System.out.println(myAddress.toString());

        myAddress.setCity("Brooklyn");
        System.out.println(myAddress.toString());

        Address upDated = new Address();
        System.out.println("upDated = " + upDated);
        upDated.setCity("Queens");
        System.out.println("upDated = " + upDated);

    }
}
