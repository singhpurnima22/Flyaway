package com.hybernate.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "bookinginfo")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	@OneToOne(targetEntity = Flights.class, cascade = CascadeType.ALL)
	
	private Flights flight;
	private String travelClass;
	//private Date travelDate;
	private Integer passengers;
	private Float totalFare;
	@OneToOne(targetEntity = UserAdmin.class, cascade = CascadeType.ALL)
	private  UserAdmin customer;
	
	
	public int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}


	public Flights getFlight() {
		return flight;
	}


	public void setFlight(Flights flight) {
		this.flight = flight;
	}


	public String getTravelClass() {
		return travelClass;
	}


	public void setTravelClass(String travelClass) {
		this.travelClass = travelClass;
	}


	

	public int getPassengers() {
		return passengers;
	}


	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}


	public Float getTotalFare() {
		return totalFare;
	}


	public void setTotalFare(Float totalFare) {
		this.totalFare = totalFare;
	}


	public UserAdmin getCustomer() {
		return customer;
	}


	public void setCustomer(UserAdmin customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", flight=" + flight + ", travelClass=" + travelClass
				+ ", passengers=" + passengers + ", totalFare=" + totalFare + ", customer=" + customer + "]";
	}


	
	
	}
