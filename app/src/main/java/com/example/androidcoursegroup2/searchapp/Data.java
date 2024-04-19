package com.example.androidcoursegroup2.searchapp;

public class Data {
    private String address;
    private String price;
    private int bedrooms;
    private int bathrooms;

    public Data(String address, String price, int bedrooms, int bathrooms) {
        this.address = address;
        this.price = price;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

    public String getAddress() {
        return address;
    }

    public void setDate(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }
}
