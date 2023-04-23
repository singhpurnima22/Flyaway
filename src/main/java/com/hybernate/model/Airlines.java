package com.hybernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airlinesinfo")
public class Airlines {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int airlinecode;
	private String airlinename;

	public int getAirlinecode() {
		return airlinecode;
	}

	public void setAirlinecode(int airlinecode) {
		this.airlinecode = airlinecode;
	}

	public String getAirlinename() {
		return airlinename;
	}

	public void setAirlinename(String airlinename) {
		this.airlinename = airlinename;
	}

}
