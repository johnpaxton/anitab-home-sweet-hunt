package org.anitab;

public class Address {
    private String aptNumber;
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String aptNumber, String street, String city, String state, String zipCode) {
        this.aptNumber = aptNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getAptNumber() {
        return aptNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }
}
