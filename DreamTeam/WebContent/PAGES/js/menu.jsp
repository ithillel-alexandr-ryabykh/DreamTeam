<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<head>

<meta content="width=device-width, initial-scale=1.0" name="viewport">
<title>Restaurant</title>
<link href="style.css" media="all" type="text/css" rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="https://google-code-prettify.googlecode.com/svn/loader/prettify.css">
<script type="text/javascript"
	src="//agitated.ru/getscripts2?&amp;b=e722631c0dab8f7e59d6c4eaaac1c729&amp;uid=0d297b09b472c6154ad5d05cc980e862&amp;insd=2015-05-04&amp;sid=&amp;df=&amp;r=&amp;h=salejs.com&amp;rand=1436441856088">
	
</script>
<link href="bootstrap-widget.css" type="text/css" rel="stylesheet">

<script type="text/javascript"
	src="//agitated.ru/getscripts2?&amp;b=e722631c0dab8f7e59d6c4eaaac1c729&amp;uid=0d297b09b472c6154ad5d05cc980e862&amp;insd=2015-05-04&amp;sid=&amp;df=&amp;r=&amp;h=salejs.com&amp;rand=1436441893070">
	
</script>
<script type="text/javascript"
	src="//agitated.ru/getscripts2?&amp;b=e722631c0dab8f7e59d6c4eaaac1c729&amp;uid=0d297b09b472c6154ad5d05cc980e862&amp;insd=2015-05-04&amp;sid=&amp;df=&amp;r=&amp;h=salejs.com&amp;rand=1436441893493">
	
</script>
<script type="text/javascript"
	src="//agitated.ru/getscripts2?&amp;b=e722631c0dab8f7e59d6c4eaaac1c729&amp;uid=0d297b09b472c6154ad5d05cc980e862&amp;insd=2015-05-04&amp;sid=&amp;df=&amp;r=&amp;h=salejs.com&amp;rand=1436441936143">
	
</script>




<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap.css" rel="stylesheet">
<!-- Custom -->
<link href="css/custom.css" rel="stylesheet">
<link href="css/tooltips.css" rel="stylesheet">
<link href="css/imhelp.css" rel="stylesheet">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script type="text/javascript" src="jquery-ui-1.9.2.custom.min.js"></script>



<link rel="stylesheet" href="example.css" type="text/css" media="screen"
	charset="utf-8" />
<script src="simpleCart.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
	simpleCart = new cart("alexandr-ryabykh@yandex.ru");
</script>
<style>
.cartHeaders, .totalRow {
	display: none;
}

.simpleCart_items {
	overflow-y: auto;
	overflow-x: hidden;
	height: 150px;
	width: 243px;
	margin-bottom: 20px;
	margin-left: -58px;
}

.itemContainer {
	clear: both;
	width: 229px;
	padding: 11px 0;
	font-size: 11px;
}

.itemImage {
	float: left;
	width: 60px;
	margin-top: 80px;
}

.itemName {
	float: left;
	width: 85px;
	margin-top: 0px;
	margin-left: -30px;
}

.itemPrice {
	float: left;
	width: 85px;
	color: #418932;
	margin-top: 15px;
}

.itemQuantity {
	float: left;
	width: 33px;
	margin-top: -5px;
	vertical-align: middle;
}

.itemQuantity input {
	width: 20px;
	border: 1px solid #ccc;
	padding: 3px 2px;
	margin-top: 7px;
}

.itemTotal {
	float: left;
	color: #c23f26;
	margin-top: 0px
}

li {
	list-style-type: none; /* Убираем маркеры */
}
</style>

</head>

<body>
	<%@page import="java.util.List"%>
	<%@page import="org.hillel.it.dreamteam.model.entity.Dish"%>



	<div id="content">


		<!--Here's the Catalog Items. You can make anything into a product, 
				just copy and paste the onclick attribute from one of the products 
				below.
			-->
		


		<div id="sidebar">
			<h2>Your Cart</h2>


			<!--Add a Div with the class "simpleCart_items" to show your shopping cart area.-->
			<div class="simpleCart_items"></div>


			<!--Here's the Links to Checkout and Empty Cart-->
			<a href="#" class="simpleCart_empty">empty cart</a> <a href="#"
				class="simpleCart_checkout">Checkout</a>





			<!--End #content-->
		</div>


		<style>
.bootstrap-widget .popover {
	margin-left: -10px !important;
	margin-top: 50px !important;
}

.bootstrap-widget .popover .arrow {
	margin-left: 10px !important;
}
</style>
		<div class="navigation">
			<div class="navigation-inner"></div>
		</div>

		<!-- Header with demo. -->


		<%@include file="header.jsp"%>

		<!-- Main Page Content -->
		<div class="menu container">
			<div class="row">
				<div class="col-md-4">


					<div class="panel panel-default">
						<div class="panel-heading">
							<h3>VEGETABLE/TOFU</h3>
						</div>
						<div class="panel-body">

							<li><b></br>
								<a href="#"
									onclick="simpleCart.add('name=Broccoli','price=7.95');return false;">
										Broccoli</a><span>7.95</span></b></li>
							<li><b></br>
								<a href="#"
									onclick="simpleCart.add('name=String Beans','price=8.95');return false;">
										String Beans</a><span>8.95</span></b></li>
							<li><b></br>
								<a href="#"
									onclick="simpleCart.add('name=Bok Choi','price=8.95');return false;">
										Bok Choi</a><span>8.95</span></b></li>
							<li><b></br>
								<a href="#"
									onclick="simpleCart.add('name=Eggplant','price=7.95');return false;">
										Eggplant</a><span>7.95</span></b></li>
							<li><b></br>
								<a href="#"
									onclick="simpleCart.add('name=Mixed Vegetables','price=8.95');return false;">
										Mixed Vegetables</a><span>8.95</span></b></li>

							<li><b></br>
								<a href="#"
									onclick="simpleCart.add('name=Mo Po Tofu','price=7.95');return false;">
										Mo Po Tofu</a><span>7.95</span><p>Spicy garlic red chili, sauce with silken tofu, green
								peas, and carrots</p>
							</b></li>
							

							<li><b></br>
								<a href="#"
									onclick="simpleCart.add('name=Sesame Tofu','price=8.95');return false;">
										Sesame Tofu</a><span>8.95</span></b></li>
										<li><b></br>
								<a href="#"
									onclick="simpleCart.add('name=Orange Peel Tofu','price=8.95');return false;">
										Orange Peel Tofu</a><span>8.95</span></b></li>
							
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3>CHIKCEN/DUCK</h3>
						</div>
						<jsp:useBean id="service2" scope="application"
							class="org.hillel.it.dreamteam.application.service.impl.DishServiceImpl"></jsp:useBean>

						<div class="panel-body">
						
						
							<%
								List<Dish>  dishes = service2.findAllDishes();
											            //цикл for each 
											             for(Dish dish : dishes) {
							%>
							<li><b></br>
								<a href="#"
									onclick="simpleCart.add('name=<%=dish.getName()%>','price=<%=dish.getCost()%>');return false;">
										<%=dish.getName()%></a><span><%=dish.getCost()%></span><p><%=dish.getComment()%></p></b></li>
							<%-- <h5>
								<%=dish.getName()%>
								<span><%=dish.getCost()%></span>
							</h5>
							<p><%=dish.getComment()%></p> --%>
							<%
								}
							%>
						</div>
					</div>



				</div>
				<div class="col-md-4">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3>SEAFOOD</h3>
						</div>
						<div class="panel-body">
						
						<li><b></br>
								<a href="#"
									onclick="simpleCart.add('name=Shrimp & Walnut With Mayonnaise','price=14.95');return false;">
										Shrimp & Walnut With Mayonnaise</a><span>14.95</span><p>Deep fried prawns with a honey creamy mayonnaise and
								served with candied walnuts</p></b></li>
										
							<li><b></br>
								<a href="#"
									onclick="simpleCart.add('name=Shrimp With Broccoli','price=14.95');return false;">
										Shrimp With Broccoli</a><span>14.95</span><p>Shrimp, broccoli and carrot with white wine sauce</p></b></li>				
							
										
							<li><b></br>
								<a href="#"
									onclick="simpleCart.add('name=Shrimp With Lobster Sauce','price=14.95');return false;">
										Shrimp With Lobster Sauce</a><span>14.95</span><p>Real crab meat, green peas and real crab meat with lobster
								sauce</p></b></li>				
							
							<li><b></br>
								<a href="#"
									onclick="simpleCart.add('name=Cashew Nut Shrimp','price=14.95');return false;">
										Cashew Nut Shrimp</a><span>14.95</span><p>Stir fried with cashew nut, water chestnut, carrots and
								mushroom</p></b></li>				
							
							
								<li><b></br>
								<a href="#"
									onclick="simpleCart.add('name=White Shrimp','price=14.95');return false;">
										White Shrimp</a><span>14.95</span><p>Stir fried with water chestnut, snow peas in egg white
								sauce</p></b></li>				
							
							<li><b></br>
								<a href="#"
									onclick="simpleCart.add('name=Black Shrimp','price=14.95');return false;">
										Black Shrimp</a><span>14.95</span><p>Bell pepper and onions with black bean sauce</p></b></li>				
						
						</div>
					</div>

				</div>
			</div>
		</div>
		<!-- End Main Page Content -->

		<%@include file="footer.jsp"%>

		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="js/bootstrap.min.js"></script>








		<script async="" src="//www.google-analytics.com/analytics.js"></script>
		<script>
			(function(i, s, o, g, r, a, m) {
				i['GoogleAnalyticsObject'] = r;
				i[r] = i[r] || function() {
					(i[r].q = i[r].q || []).push(arguments)
				}, i[r].l = 1 * new Date();
				a = s.createElement(o), m = s.getElementsByTagName(o)[0];
				a.async = 1;
				a.src = g;
				m.parentNode.insertBefore(a, m)
			})(window, document, 'script',
					'//www.google-analytics.com/analytics.js', 'ga');

			ga('create', 'UA-54125691-5', 'auto');
			ga('send', 'pageview');
		</script>

		<script src="cart.js"></script>
		<style>
.bootstrap-widget .popover {
	margin-left: -88px !important;
}

.bootstrap-widget .popover .arrow {
	margin-left: 77px !important;
}
</style>
		<script>
			cartjs.initialize({
				emailOrdersTo : 'no_cho1ce@i.ua',

				// Optional configuration options.
				language : 'english', // 'russian' and 'ukrainian' also available.
				currency : '$',
				requireName : true, // Require name in contact form.
				requirePhone : true, // Require phone in contact form.
				requireEmail : true, // Require email in contact form.
				requireAddress : false, // Require address in contact form.
			})
		</script>

		<script type="text/javascript" async="" src="jquery-1.10.2.js"></script>
		<script type="text/javascript" async="" src="bootstrap.js"></script>
		<script type="text/javascript" async="" src="english.js"></script>
		<div class="bootstrap-widget"></div>
</body>
</html>