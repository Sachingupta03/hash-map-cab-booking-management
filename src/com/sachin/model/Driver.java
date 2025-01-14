package com.sachin.model;

public class Driver{
    private String driverId;
    private String name;
    private String vehicleNumber;
    private boolean isAvailable;

    // Constructors
    public Driver(String driverId, String name, String vehicleNumber, boolean isAvailable){
        this.driverId = driverId;
        this.name = name;
        this.vehicleNumber = vehicleNumber;
        this.isAvailable = isAvailable;
    }
    // Getter and Setter

    public String getDriverId () {
        return driverId;
    }

    public void setDriverId ( String driverId ) {
        this.driverId = driverId;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getVehicleNumber () {
        return vehicleNumber;
    }

    public void setVehicleNumber ( String vehicleNumber ) {
        this.vehicleNumber = vehicleNumber;
    }

    public boolean isAvailable () {
        return isAvailable;
    }

    public void setAvailable ( boolean available ) {
        isAvailable = available;
    }
}

