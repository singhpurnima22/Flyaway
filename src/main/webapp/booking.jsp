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
		<a href="home.jsp">Home</a> <a href="Search.jsp">Search</a> <a
			href="#contact">Contact us</a> <a href="AdminLogin.jsp">Login</a>
	</div>
<form action="AddBooking" method="post">



<table width="100%">

<tr>
<td>FlightId: <%=session.getAttribute("flightId")%> </td>
<td>Price: <%=session.getAttribute("price") %></td>
<td>Customer Id: <%=session.getAttribute("pid") %></td>
</tr>

<tr>
<td>no of Passengers:</td>
<td><input type="text" name="txtcount"></td></tr>
<tr>
<td>
Select Class: </td><td><select name="ddlcls">
		<option value="-1">Select</option>
		<option value="Economy">Economy</option>
		<option value="First">First</option>
		<option value="Business">Business</option>
	</select></td></tr>
<tr>


<tr>
<td><input type="submit" value="Book"/></td>
<td><input type="reset" value="Clear Detail"/></td>
</tr>

</table>

</form>
</body>
</html>