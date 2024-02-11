package com.example.demo.controllers;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Booking;
import com.example.demo.services.BookingService;

@RestController
@CrossOrigin
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @CrossOrigin
    @PostMapping("/api/addbooking")
    public void save(@RequestBody  Booking booking) {
        bookingService.save(booking);
    }


    @CrossOrigin
    @GetMapping("/api/booking/email/{emailId}")
    public Booking getBookingByEmailId(@PathVariable String emailId)
    {
        return bookingService.getBookingByEmailId(emailId);
    }
}
