package com.hybernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airportsinfo")
public class Airports {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int airportcode;
	private String airportname;
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAirportcode() {
		return airportcode;
	}

	public void setAirportcode(int airportcode) {
		this.airportcode = airportcode;
	}

	public String getAirportname() {
		return airportname;
	}

	public void setAirportname(String airportname) {
		this.airportname = airportname;
	}

}
