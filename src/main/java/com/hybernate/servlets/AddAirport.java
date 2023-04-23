package com.hybernate.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hybernate.dao.Addairportandairline;

import com.hybernate.model.Airports;

/**
 * Servlet implementation class AddAirport
 */
@WebServlet("/AddAirport")
public class AddAirport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAirport() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String aname = request.getParameter("txtaname");
		String city = request.getParameter("txtcity");
		
		
		try
		{
			Airports a= new Airports();
			a.setAirportname(aname);
			a.setCity(city);
			
			
			//std.setInfo(cf);
			//cf.setStdinfo(std);
			
			Addairportandairline so = new Addairportandairline();
			so.addAirport(aname, city);
			response.sendRedirect("Addairport.jsp");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
