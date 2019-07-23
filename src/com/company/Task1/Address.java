package com.company.Task1;

public class Address
{
    private String index;
    private String country;
    private String region;
    private String city;
    private String street;
    private int houseNumber;
    private String houseAppendix;
    private int appartmentNumber;
    private int error;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = this.CapitalizeFirstLetter(country);
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = this.CapitalizeFirstLetter(region);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = this.CapitalizeFirstLetter(city);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = this.CapitalizeFirstLetter(street);
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber > 0 ? houseNumber : -1;
    }

    public String getHouseAppendix() {
        return houseAppendix;
    }

    public void setHouseAppendix(String houseAppendix) {
        this.houseAppendix = houseAppendix;
    }

    public int getAppartmentNumber() {
        return appartmentNumber;
    }

    public boolean setAppartmentNumber(int appartmentNumber) {
        return (this.appartmentNumber = appartmentNumber) > 0 ? true : false;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index.trim().toUpperCase();
    }

    public String CapitalizeFirstLetter(String value)
    {
        return  Character.toUpperCase(value.charAt(0)) + value.substring(1);
    }

    public Address(String index, String country, String region, String city, String street, int houseNumber, String houseAppendix, int appartmentNumber) {
        this.index = index;
        this.setCountry(country);
        this.setRegion(region);
        this.setCity(city);
        this.setStreet(street);
        this.setHouseNumber(houseNumber);
        this.houseAppendix = houseAppendix;
        error = this.setAppartmentNumber(appartmentNumber) ? 0 : 1;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "index='" + index + '\'' +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", houseAppendix='" + houseAppendix + '\'' +
                ", appartmentNumber=" + appartmentNumber +
                ", error=" + error +
                '}';
    }
}
