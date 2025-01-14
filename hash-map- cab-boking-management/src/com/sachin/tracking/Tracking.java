package com.sachin.tracking;

import com.sachin.model.Customer;
import com.sachin.model.Driver;
import com.sachin.service.CabBookingSystem;

public class Tracking{
    public static void main ( String[] args ) {
        CabBookingSystem system = new CabBookingSystem ();
        // Add Customer
        system.addCustomer (new Customer ("COO1","Mukesh","9666456400","Point A", "Point B"));
        // Add driver
        system.addDriver(new Driver ("DOO1", "Ramesh","UP66RS3333",true));
        // Book a ride
        system.bookRide ("ROO1","COO1","DOO1");
        // Complete the ride
        system.completeRide ("ROO1");
    }
}
