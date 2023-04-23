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

	<form action="SearchCheck" method="post">
		
		<h1>search your flights!!</h1>
		<%
		FlightOperations fo = new FlightOperations();
		List<Airports> airportList = fo.getAllAirports();
		request.setAttribute("airportList", airportList);
		%>


<table width="50%">
<tr>
		<td>Source : <select name="txtSource">
			<c:forEach items="${airportList}" var="ap">
				<option value="${ap.airportcode}">${ap.city}</option>
			</c:forEach>
		</select> <br /> </td>
		<td>Destination : <select name="txtdestination">
			<c:forEach items="${airportList}" var="ap">
				<option value="${ap.airportcode}">${ap.city}</option>
			</c:forEach></select></td>
			<td>Select Date : <input type="date" name="date_picker" value="2023-01-01" required></td>
			<td><input type="submit" value="Search">
		</td>
		</tr>
		
		</table>
		<h2>Register here first!!!!</h2>
		<a href="UserDetail.jsp"><h2>Register</h2></a><br>
		<h2>If already redistered please Login</h2>
		
	</form>
</body>
</html>