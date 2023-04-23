package com.hybernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "flightsinfo")
public class Flights {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightid;
	
	@OneToOne(targetEntity = Airports.class, cascade = CascadeType.ALL)
	private Airports source;
	
	@OneToOne(targetEntity = Airports.class, cascade = CascadeType.ALL)
	private Airports destination;
	
	@OneToOne(targetEntity = Airlines.class, cascade = CascadeType.ALL)
	private Airlines airline;
	
	private float price;
	private int seats;

	public Airports getSource() {
		return source;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getFlightid() {
		return flightid;
	}

	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}

	public Airports getDestination() {
		return destination;
	}

	public void setDestination(Airports destination) {
		this.destination = destination;
	}

	public Airlines getAirline() {
		return airline;
	}

	public void setAirline(Airlines airline) {
		this.airline = airline;
	}

	public void setSource(Airports source) {
		this.source = source;
	}

}
