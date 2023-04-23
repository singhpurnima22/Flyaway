package com.hybernate.connection;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.hybernate.model.Airlines;
import com.hybernate.model.Airports;
import com.hybernate.model.Booking;
import com.hybernate.model.Flights;
import com.hybernate.model.Payment;
import com.hybernate.model.UserAdmin;




public class HyberConfig {
	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration();
		Properties properties = new Properties();
		properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.put(Environment.URL, "jdbc:mysql://localhost:3306/hyberdb");
		properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		properties.put(Environment.USER, "root");
		properties.put(Environment.PASS, "admin");
		properties.put(Environment.HBM2DDL_AUTO, "update");
		properties.put(Environment.SHOW_SQL, true);
		// properties.put(Environment.FORMAT_SQL, true);
		configuration.setProperties(properties);
		
		configuration.addAnnotatedClass(Airports.class);
		configuration.addAnnotatedClass(Airlines.class);
		configuration.addAnnotatedClass(Flights.class);
		configuration.addAnnotatedClass(Flights.class);
		configuration.addAnnotatedClass(UserAdmin.class);
		configuration.addAnnotatedClass(Booking.class);
		configuration.addAnnotatedClass(Payment.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;
	}
}
