package com.hybernate.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hybernate.dao.AdminLoginOperation;


import com.hybernate.model.UserAdmin;

/**
 * Servlet implementation class AddUser
 */
@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pname=request.getParameter("txtpname");
		String phone=request.getParameter("txtphone");
		String email=request.getParameter("txtemail");
		String pwd=request.getParameter("txtpwd");
		//String count=request.getParameter("txtcount");
		
		UserAdmin user=new UserAdmin();
		user.setPersoname(pname);
		user.setPhone(phone);
		user.setEmail(email);
		user.setPwd(pwd);
		//user.setPassengercount(Integer.parseInt(count));
		
		AdminLoginOperation po=new AdminLoginOperation();
		po.addUser(user);
		
		response.sendRedirect("UserDetail.jsp");
	}

}
