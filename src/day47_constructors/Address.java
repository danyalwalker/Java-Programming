package day47_constructors;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String Country;
// contructor method - automatically called
    public Address() {
        System.out.println("address constructor");
        street = "123 unknown street";
        city = "Cool city";
        state = "Unknown";
        zipCode = "12123";
        Country = "Undefined";
    }

    //second constructor, overloaded constructor -> provides shortcut to initialize variables

    public Address(String street, String city, String State, String zipCode, String Country){
        this.street = street;
        setStreet(street); // reuse the method in the setter method
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.Country = Country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " +  state + ", " +  zipCode + ", " +  Country;
    }


}


