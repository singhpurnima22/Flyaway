<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.hybernate.connection.*"%>
<%@page import="com.hybernate.dao.*"%>
<%@page import="com.hybernate.model.*"%>

<%@page import="com.hybernate.servlets.*"%>

<%@page import="java.util.*"%>
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
<%Integer pid = (Integer) session.getAttribute("pid");

if (pid == null) {
	
%>
<h1>if you want to book please login</h1>
<h1><a href="AdminLogin.jsp">Login</a></h1><br>
<%}else{ %>
<h1><a href="AdminLogin.jsp">Logout</a></h1>
<%} %>
<hr />
<table width="100%" border="1">
<tr>
<th>Flight Number </th>
<th>Airline</th>
<th>Source </th>
<th>Destination</th>
<th>Price</th>
<th>Seats</th>
</tr>
<%
List<Flights> fList = (List<Flights>)session.getAttribute("fList");

for (Flights p : fList) {
%>
<tr>
<td>
	<%=p.getFlightid()%>
</td>
<td><%=p.getAirline().getAirlinename()%></td>
<td>
	<%=p.getSource().getAirportname()%>
</td>

<td>
<%=p.getDestination().getAirportname()%>
</td>
<td>
<%=p.getPrice()%>
</td>
<td><%=p.getSeats()%></td>
<%

if (pid != null) {
	
%>
<td><%
session.setAttribute("flightId", p.getFlightid());
%></td>
<td><%
session.setAttribute("price", p.getPrice());
%></td>
<td><a href="booking.jsp" >Book</a></td>
<%
}
}
%>
</tr>

</table>

</body>
</html>