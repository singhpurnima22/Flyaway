package com.hybernate.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hybernate.connection.HyberConfig;
import com.hybernate.model.Airlines;
import com.hybernate.model.Airports;
import com.hybernate.model.Flights;

public class FlightOperations {
	SessionFactory sf=null;
	
	public FlightOperations() 
	{
	 sf=HyberConfig.getSessionFactory();
	}
	public void addFlight(Airports source,Airports destination, Airlines al,Flights fs) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		fs.setAirline(al);
		fs.setSource(source);
		fs.setDestination(destination);
		
		session.save(fs);
		tr.commit();
	}
	
	public List<Flights> showAllFlights(){
		Session session = sf.openSession();
		TypedQuery qry = session.createQuery("from Flights");
		List<Flights>stdall=qry.getResultList();
		return stdall;
	}

	public List<Flights> searchFlightsbycode(String sourceCode, String destinationCode) {
		Session session = sf.openSession();
		TypedQuery qry = session.createQuery("from Flights where source.airportcode=" + sourceCode
				+ "and destination.airportcode=" + destinationCode);
		List<Flights> tdall = qry.getResultList();
		return tdall;
	}
	

	public List<Airports> getAllAirports(){
		Session session = sf.openSession();
		TypedQuery qry = session.createQuery("from Airports");
		List<Airports> stdall=qry.getResultList();
		return stdall;
	}
	
	public List<Airlines> getAllAirlines(){
		Session session = sf.openSession();
		TypedQuery qry = session.createQuery("from Airlines");
		List<Airlines> stdall=qry.getResultList();
		return stdall;
	}
	
	public Airlines getAirlineByCode(int code){
		Session session = sf.openSession();
		TypedQuery qry = session.createQuery("from Airlines where airlinecode="+code);
		Airlines stdall= (Airlines)qry.getSingleResult();
		return stdall;
	}
	
	public Airports getAirportByCode(int code){
		Session session = sf.openSession();
		TypedQuery qry = session.createQuery("from Airports where airportcode="+code);
		Airports stdall= (Airports)qry.getSingleResult();
		return stdall;
	}
	public Flights getFlightById(Integer flightId) {
		Session session = sf.openSession();
		TypedQuery qry = session.createQuery("from Flights where flightid="+flightId);
		Flights stdall=(Flights)qry.getSingleResult();
		return stdall;
	}
}
