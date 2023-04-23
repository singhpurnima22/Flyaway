<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.hybernate.dao.*"%>
<%@page import="java.util.*"%>
<%@page import="com.hybernate.model.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
 background-image: url("images/travel-concept-blue-background.jpeg"); /* The image used */
  background-color: #cccccc; /* Used if the image is unavailable */
  height: 500px; /* You must set a specified height */
  background-position: center; /* Center the image */
  background-repeat: no-repeat; /* Do not repeat the image */
  background-size: cover; 
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
	  
}

.topnav {
	overflow: hidden;
	background-color: #333;
}

.topnav a {
	float: left;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a:hover {
	background-color: #ddd;
	color: black;
}

.topnav a.active {
	background-color: #04AA6D;
	color: white;
}

.center {
	margin-left: auto;
	margin-right: auto;
}
</style>
<title>search</title>
</head>
<body>
<div class="topnav">
		<a href="home.jsp">Home</a> <a href="search.jsp">search</a> <a
			href="#contact">Contact us</a> <a href="AdminLogin.jsp">Login</a>
	</div>

<h1>Welcome to <%=session.getAttribute("pname") %></h1>
<h2><a href="AdminLogin.jsp">logout</a></h2><br><br>
<hr><br>
<table width="100%" border="1"> 
<tr>
<td>Person Name:</td>
<td><%=session.getAttribute("pname") %></td></tr>
<tr>
<td>Contact No:</td>
<td><%=session.getAttribute("ph") %></td></tr>
<tr>
<td>Email:</td>
<td><%=session.getAttribute("pemail") %></td></tr>
</table>
<a href="UserBookings"><h1>view your booking</h1></a>
<a href="search.jsp"><h1>Book Flight</h1></a>
</body>
</html>