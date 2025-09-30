package com.claritapersonalizados.stock.entities;

import java.util.GregorianCalendar;

import com.claritapersonalizados.stock.enums.MovementType;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CPMovimentacao")
public class Movement {
	private MovementType type;

	private GregorianCalendar movementDate;

	public MovementType getType() {
		return type;
	}

	public void setType(MovementType type) {
		this.type = type;
	}

	public GregorianCalendar getMovementDate() {
		return movementDate;
	}

	public void setMovementDate(GregorianCalendar date) {
		this.movementDate = date;
	}
}
