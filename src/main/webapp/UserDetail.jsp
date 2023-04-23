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
<form action="AddUser" method="post">
<table width="100%">
<tr>
<td>User Name:</td>
<td><input type="text" name="txtpname"></td></tr>
<tr>
<td>Contact No:</td>
<td><input type="text" name="txtphone"></td></tr>
<tr>
<td>Email:</td>
<td><input type="email" name="txtemail"></td></tr>
<tr>
<td>Password:</td>
<td><input type="text" name="txtpwd"></td>
</tr>

<tr>
<td><input type="submit" value="Add user"/></td>
<td><input type="reset" value="Clear Detail"/></td>
</tr>
<td colspan="2">
if already registered:<a href="AdminLogin.jsp"><h2>Login here</h2></a></td>
</td>
</table>
</form>
</body>
</html>