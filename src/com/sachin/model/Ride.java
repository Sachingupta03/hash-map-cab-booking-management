package com.sachin.model;

public class Ride{
    private String rideId;
    private Customer customer;
    private Driver driver;
    private String status; // e.g., "ongoing", "completed"

    // Constructors
    public Ride(String rideId, Customer customer, Driver driver,String status){
    }
    // Getter and Setter

    public String getRideId () {
        return rideId;
    }

    public void setRideId ( String rideId ) {
        this.rideId = rideId;
    }

    public Customer getCustomer () {
        return customer;
    }

    public void setCustomer ( Customer customer ) {
        this.customer = customer;
    }

    public Driver getDriver () {
        return driver;
    }

    public void setDriver ( Driver driver ) {
        this.driver = driver;
    }

    public String getStatus () {
        return status;
    }

    public void setStatus ( String status ) {
        this.status = status;
    }
}
