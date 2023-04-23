package com.hybernate.servlets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hybernate.dao.AdminLoginOperation;
import com.hybernate.model.UserAdmin;


/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("txtuser");
		String pwd=request.getParameter("txtpass");
		
		
		if(user.equals("admin")&&pwd.equals("admin")) {
			response.sendRedirect("AdminWelcome.jsp");
		}
		else{
			AdminLoginOperation po=new AdminLoginOperation ();
			UserAdmin person=po.checkLoginDetails(user, pwd);
		
				if(person!=null) {
						HttpSession session=request.getSession();
						session.setAttribute("pid", person.getPersonid());
						session.setAttribute("pname", person.getPersoname());
						session.setAttribute("ph", person.getPhone());
						session.setAttribute("pemail", person.getEmail());
						session.setAttribute("ppwd", person.getPwd());
					
						response.sendRedirect("UserWelcome.jsp");
		}
		else 
			response.sendRedirect("Error.jsp");
	}
	}}


