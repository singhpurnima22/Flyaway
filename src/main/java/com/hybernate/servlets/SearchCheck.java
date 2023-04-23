package com.hybernate.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hybernate.dao.FlightOperations;
import com.hybernate.model.Flights;

/**
 * Servlet implementation class SearchCheck
 */
@WebServlet("/SearchCheck")
public class SearchCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sourceCode = request.getParameter("txtSource");
		String destinationCode = request.getParameter("txtdestination");
		
		
	
			
					/*HttpSession session=request.getSession();
					session.setAttribute("fid", f.getFlightid());
					session.setAttribute("aname", f.getAirline());
					session.setAttribute("source", f.getSource());
					session.setAttribute("destination", f.getDestination());
					session.setAttribute("price", f.getPrice());
					session.setAttribute("seats", f.getSeats());
					response.sendRedirect("searchresult.jsp");
					
	}*/
				try {
					FlightOperations fo = new FlightOperations();
					//Flights flight = new Flights();
					List<Flights> flights = fo.searchFlightsbycode(sourceCode, destinationCode);
					
					HttpSession session=request.getSession();
					session.setAttribute("fList", flights);
					response.sendRedirect("searchresult.jsp");
				}
				catch (Exception ex) {
					System.out.println(ex);
				}
	
}}

		
			

