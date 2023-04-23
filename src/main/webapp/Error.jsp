<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<h1>Please check user name or password</h1>
<h2><a href="AdminLogin.jsp">Relogin here</a></h2>
</body>
</html>