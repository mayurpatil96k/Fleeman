package com.example.demo.services;

import java.util.Optional;

import com.example.demo.entities.Invoice;

public interface InvoiceManager {
	void addInvoice(Invoice invoice);
	Optional<Invoice> getbillingbybookid(int id);
}
