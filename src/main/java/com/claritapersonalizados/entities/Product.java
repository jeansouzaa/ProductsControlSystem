package com.claritapersonalizados.entities;

import com.claritapersonalizados.purchasing.entities.Supplier;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CPProduto")
public class Product {

	private String SKU;

	private String description;

	private int quantity;

	private String category;

	private Double mediaCost;

	private Double basementPrice;

	private String targetMargin;

	private Supplier supplier;

	public String getSKU() {
		return SKU;
	}

	public void setSKU(String sKU) {
		SKU = sKU;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getMediaCost() {
		return mediaCost;
	}

	public void setMediaCost(Double mediaCost) {
		this.mediaCost = mediaCost;
	}

	public Double getBasementPrice() {
		return basementPrice;
	}

	public void setBasementPrice(Double basementPrice) {
		this.basementPrice = basementPrice;
	}

	public String getTargetMargin() {
		return targetMargin;
	}

	public void setTargetMargin(String targetMargin) {
		this.targetMargin = targetMargin;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
}