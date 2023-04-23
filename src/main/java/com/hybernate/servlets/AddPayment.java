package com.hybernate.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hybernate.dao.BookingOperation;
import com.hybernate.dao.PaymentOperation;
import com.hybernate.model.Booking;
import com.hybernate.model.Payment;

/**
 * Servlet implementation class SearchCheck
 */
@WebServlet("/AddPayment")
public class AddPayment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPayment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Booking br = (Booking)session.getAttribute("booking");
		String cardno=request.getParameter("txtcard");
		
		
		try
		{					
			BookingOperation bo=new BookingOperation();
			bo.addNewBooking(br);
			
			Payment p = new Payment();
			p.setBooking(br);
			p.setCardno(Long.parseLong(cardno));
			PaymentOperation po=new PaymentOperation();
			po.addNewPaymentDetail(p);
			response.sendRedirect("Congratulation.jsp");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

		
}}

		
			

