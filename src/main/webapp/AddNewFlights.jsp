<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="com.hybernate.dao.*"%>
<%@page import="java.util.*"%>
<%@page import="com.hybernate.model.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="AddFlights">

		<%
	FlightOperations fo = new FlightOperations();
	List<Airports> airportList = fo.getAllAirports();
	List<Airlines> airlineList = fo.getAllAirlines();
	request.setAttribute("airlineList", airlineList);
	request.setAttribute("airportList", airportList);
%>

		Airline Name : <select name="txtairlinename">
			<c:forEach items="${airlineList}" var="a">
				<option value="${a.airlinecode}">${a.airlinename}</option>
			</c:forEach>
		</select> <br /> Source Airport Name: <select name="txtSource">
			<c:forEach items="${airportList}" var="ap">
				<option value="${ap.airportcode}">${ap.airportname}</option>
			</c:forEach>
		</select> <br /> Destination Airport Name: <select name="txtdestination">
			<c:forEach items="${airportList}" var="ap">
				<option value="${ap.airportcode}">${ap.airportname}</option>
			</c:forEach>
		</select> <br /> Total Seats : <input type="text" name="txtseats" /> <br />
		Price : <input type="text" name="txtprice" /> <br /> <input
			type="submit" value="Add Flight" /> <input type="reset"
			value="Clear All" />

	</form>
</body>
</html>