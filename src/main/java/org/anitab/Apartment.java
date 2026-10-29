package org.anitab;

public class Apartment {
    private final int apartmentId;
    private final Address address;
    private final int bedrooms;
    private final float bathrooms;
    private int price;

    public Apartment(int apartmentId, Address address, int bedrooms, float bathrooms, int price) {
        this.apartmentId = apartmentId;
        this.address = address;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.price = price;
    }

    public int getApartmentId() {
        return apartmentId;
    }

    public Address getAddress() {
        return address;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public float getBathrooms() {
        return bathrooms;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
