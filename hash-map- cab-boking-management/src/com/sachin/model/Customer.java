package com.sachin.model;

public class Customer{
    private String customerId;
    private String name;
    private String phoneNumber;
    private String pickUpLocation;
    private String dropLocation;

    // Constructors
    public Customer(String customerId, String name, String phoneNumber,String pickUpLocation, String dropLocation){
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.pickUpLocation = pickUpLocation;
        this.dropLocation = dropLocation;
    }
    // Getter and Setters

    public String getCustomerId () {
        return customerId;
    }

    public void setCustomerId ( String customerId ) {
        this.customerId = customerId;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getPhoneNumber () {
        return phoneNumber;
    }

    public void setPhoneNumber ( String phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }

    public String getPickUpLocation () {
        return pickUpLocation;
    }

    public void setPickUpLocation ( String pickUpLocation ) {
        this.pickUpLocation = pickUpLocation;
    }

    public String getDropLocation () {
        return dropLocation;
    }

    public void setDropLocation ( String dropLocation ) {
        this.dropLocation = dropLocation;
    }

    public void put ( String customerId, Customer customer ) {
    }
}
