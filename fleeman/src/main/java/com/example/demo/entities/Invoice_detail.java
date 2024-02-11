package com.example.demo.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Invoice_detail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int IdetailId;
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name = "Invoice_id") 
	private Invoice invoice;
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name = "AddonId") 
	private AddOn addon;
	private int amt;
	public int getIdetailId() {
		return IdetailId;
	}
	public void setIdetailId(int idetailId) {
		IdetailId = idetailId;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	public AddOn getAddon() {
		return addon;
	}
	public void setAddon(AddOn addon) {
		this.addon = addon;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	
}
