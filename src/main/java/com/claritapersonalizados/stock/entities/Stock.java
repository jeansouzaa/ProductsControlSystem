package com.claritapersonalizados.stock.entities;

import com.claritapersonalizados.entities.Product;
import com.claritapersonalizados.stock.enums.StockStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CPEstoque")
public class Stock {

	private Product product;

	private int quantity;

	private StockStatus status;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public StockStatus getStatus() {
		return status;
	}

	public void setStatus(StockStatus status) {
		this.status = status;
	}
}
