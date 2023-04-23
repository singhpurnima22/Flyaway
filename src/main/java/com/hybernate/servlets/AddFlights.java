package com.hybernate.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hybernate.dao.FlightOperations;
import com.hybernate.model.Airlines;
import com.hybernate.model.Airports;
import com.hybernate.model.Flights;

/**
 * Servlet implementation class AddFlights
 */
@WebServlet("/AddFlights")
public class AddFlights extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddFlights() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// System.out.println("In addFlights Servlet...");

		/// FlightOperations fo = new FlightOperations();
		// List<Flights> flights = fo.showAllFlights();

		// System.out.println("Flights: "+ flights);

		String alname = request.getParameter("txtairlinename");
		String sourceName = request.getParameter("txtSource");
		String destinationName = request.getParameter("txtdestination");
		String totalseats = request.getParameter("txtseats");
		String price = request.getParameter("txtprice");

		try {
			FlightOperations fo = new FlightOperations();
			
			Airports source = fo.getAirportByCode(Integer.parseInt(sourceName));
			
			Airlines airline1 = fo.getAirlineByCode(Integer.parseInt(alname));
			
			Airports destination = fo.getAirportByCode(Integer.parseInt(destinationName));
			
			Flights flight = new Flights();
			flight.setPrice(Float.parseFloat(price));
			flight.setSeats(Integer.parseInt(totalseats));
			
			
			fo.addFlight(source, destination,airline1, flight);
			response.sendRedirect("AddNewFlights.jsp");
			
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
