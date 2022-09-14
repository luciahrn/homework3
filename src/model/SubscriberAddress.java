package model;

public class SubscriberAddress {
    private String streetName;
    private Integer streetNumber;
    private String city;
    private String country;
    private Integer zipCode;

    public SubscriberAddress(String streetName, Integer streetNumber, String city, String country, Integer zipCode) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }
}
