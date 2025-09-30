package com.claritapersonalizados.purchasing.entities;

import java.util.GregorianCalendar;
import java.util.List;

import com.claritapersonalizados.entities.Product;
import com.claritapersonalizados.purchasing.enums.PurchaseType;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CPCompra")
public class PurchaseOrder {
	private List<Product> products;

	private PurchaseType type;

	private GregorianCalendar purchaseDate;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public PurchaseType getType() {
		return type;
	}

	public void setType(PurchaseType type) {
		this.type = type;
	}

	public GregorianCalendar getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(GregorianCalendar purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
}
