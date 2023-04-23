package com.hybernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hybernate.connection.HyberConfig;
import com.hybernate.model.Airlines;
import com.hybernate.model.Airports;

public class Addairportandairline {
	SessionFactory sf=null;
	public Addairportandairline() {
		sf=HyberConfig.getSessionFactory();
	}
	
	
	public void addAirport(String aname,String acity) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Airports ap=new Airports();
		ap.setAirportname(aname);
		ap.setCity(acity);
		session.save(ap);
		tr.commit();
	}
	public void addAirline(String alname) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Airlines ap=new Airlines();
		ap.setAirlinename(alname);
		session.save(ap);
		tr.commit();
	}
}
