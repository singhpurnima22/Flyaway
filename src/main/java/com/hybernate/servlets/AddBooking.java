package com.hybernate.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hybernate.dao.AdminLoginOperation;
import com.hybernate.dao.BookingOperation;
import com.hybernate.dao.FlightOperations;
import com.hybernate.model.Booking;
import com.hybernate.model.Flights;
import com.hybernate.model.UserAdmin;

/**
 * Servlet implementation class SearchCheck
 */
@WebServlet("/AddBooking")
public class AddBooking extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBooking() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Integer flightId = (Integer)session.getAttribute("flightId");
		Float price = (Float)session.getAttribute("price");
		Integer custid = (Integer)session.getAttribute("pid");
		
		FlightOperations fo = new FlightOperations();
		String travellercount = request.getParameter("txtcount");
		String flightclass = request.getParameter("ddlcls");
		Float amount = Integer.parseInt(travellercount)*price;
		
		try
		{
			Booking br=new Booking();
			br.setPassengers(Integer.parseInt(travellercount));
			br.setTravelClass(flightclass);
			br.setTotalFare(amount);
			
			Flights f=fo.getFlightById(flightId);
			
			AdminLoginOperation uo = new AdminLoginOperation();
			UserAdmin ua= uo.getUserById(custid);
			
			br.setFlight(f);
			br.setCustomer(ua);
			
			//BookingOperation bo=new BookingOperation();
			//bo.addNewBooking(br);
			session.setAttribute("booking", br);
			response.sendRedirect("payment.jsp");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

		
}}

		
			

