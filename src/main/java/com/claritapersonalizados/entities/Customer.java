package com.claritapersonalizados.entities;

import com.claritapersonalizados.enums.ClientType;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CPClientes")
public class Customer {

	private String name;

	private Contact contact;

	private String address;

	private String document;

	private ClientType clientType;

	private PurchaseHistory purchaseHistory;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public ClientType getClientType() {
		return clientType;
	}

	public void setClientType(ClientType clientType) {
		this.clientType = clientType;
	}

	public PurchaseHistory getPurchaseHistory() {
		return purchaseHistory;
	}

	public void setPurchaseHistory(PurchaseHistory purchaseHistory) {
		this.purchaseHistory = purchaseHistory;
	}
}
