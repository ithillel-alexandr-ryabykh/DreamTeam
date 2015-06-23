<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset='utf-8'>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="Restaurant-site-flip">
<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Custom -->
<link href="css/custom.css" rel="stylesheet">
<title>Restaurant</title>
</head>

<body>
	<!-- Navbar -->
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span> <span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.html"><small>厨师</small>
					Mr. Chef's</a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav nav-pills navbar-left">
					<li class="active"><a href="index.html"><span
							class="glyphicon glyphicon-home" aria-hidden="true"></span> Home</a>
					</li>
					<li><a href="menu.html"><span
							class="glyphicon glyphicon-cutlery" aria-hidden="true"></span>
							Menu</a></li>
					<li><a href="online_order.html"><span
							class="glyphicon glyphicon-phone" aria-hidden="true"></span>
							Online Order</a></li>
					<li><a href="maps_and_directions.html"><span
							class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>
							Maps and Directions</a></li>
					<li><a href="contact_us.html"><span
							class="glyphicon glyphicon-phone-alt" aria-hidden="true"></span>
							Contact Us</a></li>
				</ul>

			</div>
		</div>
	</nav>
	<!-- End Navbar -->

	<!-- Main Page Content -->
	<!-- Carousel -->
	<div id="carousel" class="carousel slide" data-ride="carousel">
		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="imgs/carousel1.jpg" alt="Delicious Tea">
			</div>
			<div class="item">
				<img src="imgs/carousel2.jpg" alt="Delicious Edamame">
			</div>
			<div class="item">
				<img src="imgs/carousel3.jpg" alt="Delicious Satay">
			</div>
			<div class="item">
				<img src="imgs/carousel4.jpg" alt="Delicious Dumplings">
			</div>
			<div class="item">
				<img src="imgs/carousel5.jpg" alt="Delicious Noodles">
			</div>
			<div class="item">
				<img src="imgs/carousel6.jpg" alt="Asian Theme">
			</div>
		</div>
		<!-- Controls -->
		<a class="left carousel-control" href="#carousel" role="button"
			data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
			aria-hidden="true"></span> <span class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#carousel" role="button"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>
	<!-- End Carousel -->
	<!-- End Main Page Content -->

	<!-- Bottom of Page Content -->
	<div class="container-fluid">
		<div class="row well well-carousel">
			<div class="col-sm-4 col-md-4">
				<h4>Mr. Chef's Fine Chinese Cuisine & Bar</h4>
				<p>
					18800 NE 29 AVE, Suite 10 <br> Aventura, FL 33180 <br>
					Tel: (786) 787-9030 <br> Fax: (786) 787-9070 <br>
					info@aventurachef.com
				</p>
			</div>
			<div class="col-sm-4 col-md-4">
				<h4>Daily Hours</h4>
				<p>
					Monday - Friday: 12:00 pm to 11:00 pm <br> Saturday - Sunday:
					2:00 pm to 11:00 pm
				</p>
				<h4>Business Hours</h4>
				<p>7 Days a Week including Weekends and Holidays</p>
			</div>
			<div class="col-sm-2 col-md-2">
				<h4>Restaurant</h4>
				<p>
					<a href="menu.html">Menu</a> <br> <a href="online_order.html">Online
						Order</a> <br> <a href="maps_and_directions.html">Maps and
						Directions</a> <br>
				</p>
			</div>
			<div class="col-sm-2 col-md-2">
				<h4>About</h4>
				<p>
					<a href="contact_us.html">Contact Us</a> <br> <a
						href="https://www.google.com/maps/place/Mr.+Chef's+Fine+Chinese+Cuisine+%26+Bar/@25.949719,-80.142875,3a,75y,229.19h,79.5t/data=!3m5!1e1!3m3!1s8QGvA5hTpGKnkP8zuxvsDw!2e0!3e2!4m2!3m1!1s0x0:0xd557dc5dc02faf8e!6m1!1e1?hl=en"
						target="_blank">Virtual Tour</a>
				</p>
			</div>
		</div>
	</div>
	<!-- End Bottom of Page Content -->

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>

</html>
