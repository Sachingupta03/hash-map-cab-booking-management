package com.sachin.service;

import com.sachin.model.Customer;
import com.sachin.model.Driver;
import com.sachin.model.Ride;

import java.util.HashMap;

public class CabBookingSystem{
    private HashMap<String, Customer> customers  = new HashMap<> ();
    private HashMap<String, Driver> drivers = new HashMap<> ();
    private HashMap<String, Ride>  rids = new HashMap<> ();

    // Add a new driver
    public void addCustomer(Customer customer){
        customer.put(customer.getCustomerId (),customer);
    }

    // Assign a ride
    public void bookRide(String rideId, String customerId, String driverId){
       Customer customer;
        customer = customers.get(customerId);
        Driver driver = drivers.get (driverId);
        if (customer == null || driver == null || !driver.isAvailable ()){
            System.out.println ("Ride booking failed.");
            return;
        }
        driver.setAvailable (false); //Mark driver as unavailable
        Ride ride = new Ride (rideId,customer,driver,"Ongoing");
        rids.put(rideId,ride);
        System.out.println ("Ride booking successfully. ");
    }
    // Complete a ride
    public void completeRide(String rideId){
        Ride ride = rids.get (rideId);
        if (ride != null){
            ride.setStatus ("Completed");
            ride.getDriver ().setAvailable (true); // Mark driver as Available
            System.out.println ("Ride completed. ");
        } else {
            System.out.println ("Ride not found. ");
        }
    }

    public void addDriver ( Driver driver ) {
    }
}
