<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@page import="java.util.ResourceBundle"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">-->
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="service" scope="application"
		class="org.hillel.it.dreamteam.application.service.impl.DishServiceImpl"></jsp:useBean>
	<%
		ResourceBundle resourceBundle = ResourceBundle.getBundle(
				"message", request.getLocale());
	System.out.println(request.getLocale());
	%>

	<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.jsp"> <%=
 	resourceBundle.getString("Mr._Chef's")
 %></a>
		</div>
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav nav-pills navbar-left">
				<li><a href="index.jsp"><span
						class="glyphicon glyphicon-home" aria-hidden="true"></span> <%=
 	resourceBundle.getString("Home")
 %></a></li>
				<li><a href="menu.jsp"><span
						class="glyphicon glyphicon-cutlery" aria-hidden="true"></span> <%=
 	resourceBundle.getString("Menu")
 %></a></li>
				<li><a href="online_order.jsp"><span
						class="glyphicon glyphicon-phone" aria-hidden="true"></span> <%=
 	resourceBundle.getString("Online_Order")
 %> </a></li>
				
				<li class="active"><a href="contact_us.jsp"><span
						class="glyphicon glyphicon-phone-alt" aria-hidden="true"></span> <%=
 	resourceBundle.getString("Contact_Us")
 %>
				</a></li>
			</ul>
		</div>
	</div>
	</nav>
</body>
</html>