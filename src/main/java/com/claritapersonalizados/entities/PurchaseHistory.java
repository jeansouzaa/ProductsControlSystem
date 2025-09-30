package com.claritapersonalizados.entities;

import java.util.GregorianCalendar;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CPHistoricoCompra")
public class PurchaseHistory {

	private List<Product> products;

	private GregorianCalendar purchaseDate;

	private Customer client;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public GregorianCalendar getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(GregorianCalendar purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Customer getClient() {
		return client;
	}

	public void setClient(Customer client) {
		this.client = client;
	}
}
