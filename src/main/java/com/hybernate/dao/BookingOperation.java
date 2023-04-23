package com.hybernate.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hybernate.connection.HyberConfig;
import com.hybernate.model.Airlines;
import com.hybernate.model.Airports;
import com.hybernate.model.Booking;
import com.hybernate.model.Flights;
import com.hybernate.model.UserAdmin;

public class BookingOperation {
	SessionFactory sf=null;
	
	public BookingOperation() {
		sf=HyberConfig.getSessionFactory();
	}
	public void addNewBooking(Booking br) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(br);
		tr.commit();
	}
	public List<Booking> showAllBookingByCustID(Integer customerid){
		Session session = sf.openSession();
		TypedQuery qry = session.createQuery("from Booking where customer.personid="+customerid);
		List<Booking> stdall=qry.getResultList();
		return stdall;
	}
}
