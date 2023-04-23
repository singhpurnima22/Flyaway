package com.hybernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hybernate.connection.HyberConfig;
import com.hybernate.model.Payment;

public class PaymentOperation {
	SessionFactory sf=null;
	
	public PaymentOperation() {
		sf=HyberConfig.getSessionFactory();
	}
	public void addNewPaymentDetail(Payment p) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(p);
		tr.commit();
	}
}
