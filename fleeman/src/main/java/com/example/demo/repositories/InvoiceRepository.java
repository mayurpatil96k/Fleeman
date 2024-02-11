package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Integer>{
	@Query(value = "select * from Invoice where booking_id = :bookingId ORDER BY invoice_id DESC limit 1", nativeQuery = true)
	public Optional<Invoice> getBillingByBookingId(@Param("bookingId") int bookingId); 
	
}
