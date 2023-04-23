package com.hybernate.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hybernate.dao.Addairportandairline;
import com.hybernate.model.Airlines;
import com.hybernate.model.Airports;

/**
 * Servlet implementation class AddAirline
 */
@WebServlet("/AddAirline")
public class AddAirline extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAirline() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String alname = request.getParameter("txtalname");
		try
		{
			Airlines a= new Airlines();
			a.setAirlinename(alname);
			//std.setInfo(cf);
			//cf.setStdinfo(std);
			
			Addairportandairline ao=new Addairportandairline();
			ao.addAirline(alname);
			response.sendRedirect("Addairline.jsp");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
