<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
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
	
	/*Footer*/
footer {
    background-color: #40474e;
    color: white;
    padding: 2rem 0 2rem;
    margin-top: 2rem;

}

footer img {
    height: 4rem;
    margin: 1.5rem 0rem;
}

footer a {
    color: white;
}

hr.socket {
    width: 100%;
    border-top: .2rem solid #666b71;
}
}
</style>
</head>
<body>

	<div class="topnav">
		<a  href="#home">Home</a> <a href="search.jsp">Search</a> <a
			href="#contact">Contact us</a> <a href="AdminLogin.jsp">Login</a>
	</div>
    
	<div style="padding-left: 16px">
		<h2>Top Navigation Example</h2>
		<p>FlyAway is India's largest passenger airline with a market
			share . We primarily operate in India's domestic air travel market as
			a low-cost carrier with focus on our three pillars – offering low
			fares, being on-time and delivering a courteous and hassle-free
			experience. Since our inception in August 2006, we have grown from a
			carrier with one plane to a fleet of 300 aircraft today. A uniform
			fleet for each type of operation, high operational reliability and an
			award winning service make us one of the most reliable airlines in
			the world. IndiGo has a total destination count of 101 with 75
			domestic destinations and 26 international.
			<h3> The preferred airline</h3>
			IndiGo is not only the most efficient low fare operator domestically
			but is also comparable with global low cost airlines. We are
			constantly enhancing our engagement with our passengers to augment
			their travel experience. From multichannel direct sales (including
			online flight booking, call centers and airport counters), to online
			flight status checking, an exclusive IndiGo app for Android, we have
			transformed air travel in India. Today, we are India's most preferred
			airline. At Flyaway, low fares come with high quality.</p>
	</div>
	<img src="images/flight2.jpg" width="1500" height="600">
<footer>
		<div class="row justify-content-center">
			<div class="col-md-5 text-center">
				<i class="fas fa-plane pr-2 fa-4x text-primary"></i>
				<p>Here at Fly Away we provide flights at the cheapest rate to
					help you reach your destination</p>
				<strong>Contact Info</strong>
				<p>
					<i class="fas fa-phone-square pr-2 fa-2x text-success"></i>{888}
					888-8888
				</p>
				<p>
					<i class="fas fa-envelope-open-text pr-2 fa-2x text-success"></i>support@flyaway.com
				</p>

			</div>

			<hr class="socket">
			<p>&copy; FlyAway, All Rights Reserved</p>
		</div>
	</footer>
</body>
</html>
</html>