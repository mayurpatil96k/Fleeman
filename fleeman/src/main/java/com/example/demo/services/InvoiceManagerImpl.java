package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Invoice;
import com.example.demo.repositories.InvoiceRepository;

@Service
public class InvoiceManagerImpl implements InvoiceManager{

	@Autowired
	private InvoiceRepository i_repository;
	
	@Override
	public void addInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		i_repository.save(invoice);
		
	}

	@Override
	public Optional<Invoice> getbillingbybookid(int id) {
		// TODO Auto-generated method stub
		return i_repository.getBillingByBookingId(id);
	}

	

}
