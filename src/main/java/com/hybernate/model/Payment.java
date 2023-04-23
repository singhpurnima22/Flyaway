package com.hybernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "paymentinfo")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentid;
	private Long cardno;

	
	@OneToOne(targetEntity = Booking.class, cascade = CascadeType.ALL)
	private Booking booking;


	public int getPaymentid() {
		return paymentid;
	}


	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}


	public Long getCardno() {
		return cardno;
	}


	public void setCardno(Long cardno) {
		this.cardno = cardno;
	}


	public Booking getBooking() {
		return booking;
	}


	public void setBooking(Booking booking) {
		this.booking = booking;
	}


	@Override
	public String toString() {
		return "Payment [paymentid=" + paymentid + ", cardno=" + cardno + ", booking=" + booking + "]";
	}
	
}
