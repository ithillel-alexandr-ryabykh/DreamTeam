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
    <%@include file="header.jsp"%>

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
      <a class="left carousel-control" href="#carousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#carousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div>
    <!-- End Carousel -->
    <!-- End Main Page Content -->

    <%@include file="footer.jsp"%>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>

</html>
