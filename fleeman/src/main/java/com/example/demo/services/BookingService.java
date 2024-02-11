package com.example.demo.services;

import com.example.demo.entities.Booking;

public interface BookingService {
    void save(Booking booking);
    public Booking getBookingByEmailId(String emailId);
}

