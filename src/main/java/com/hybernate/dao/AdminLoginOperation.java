package com.hybernate.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hybernate.connection.HyberConfig;


import com.hybernate.model.UserAdmin;


public class AdminLoginOperation {
	SessionFactory sf=null;
	
	public AdminLoginOperation() {
		sf=HyberConfig.getSessionFactory();
	}
	
	
	
	public void addUser(UserAdmin ua) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		session.save(ua);
		tr.commit();
	}
	public List<UserAdmin> showAll(){
		Session session=sf.openSession();
		TypedQuery qry=session.createQuery("from UserAdmin");
		List<UserAdmin> pall=qry.getResultList();
		return pall;
	}
	
	public UserAdmin getUserById(Integer id){
		Session session=sf.openSession();
		TypedQuery qry=session.createQuery("from UserAdmin where personid="+id);
		UserAdmin pall=(UserAdmin)qry.getSingleResult();
		return pall;
	}
	
	public UserAdmin checkLoginDetails(String uname,String pwd) {
		Session session=sf.openSession();
		TypedQuery qry=session.createQuery("from UserAdmin");
		List<UserAdmin> pall=qry.getResultList();
		UserAdmin user=null;
		for(UserAdmin p:pall) {
			if(p.getEmail().equals(uname)&&p.getPwd().equals(pwd)) {
				user=new UserAdmin();
				user =p;
				break;
			}
			
		}
		return user;
	}
	}
	
	

