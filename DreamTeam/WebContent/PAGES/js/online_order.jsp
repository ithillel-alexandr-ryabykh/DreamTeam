<%@ page language="java" contentType="text/html; charset=utf-8"
  pageEncoding="utf-8"%>
  <!DOCTYPE html>
<html>
  <head>
    <meta charset='utf-8'>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Restaurant-site-flip : ">
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom -->
    <link href="css/custom.css" rel="stylesheet">
    <title>Restaurant-Site-Flip</title>
  </head>

  <body>
    <%@include file="header.jsp"%>

    <!-- Main Page Content -->
    <div class="container">
      <div class="row">
        <div class="col-sm-offset-1 col-sm-5 col-md-offset-2 col-md-4">
          <div class="thumbnail">
            <img class="img-responsive img-rounded" src="imgs/online.jpg" alt="Delicious Chicken">
            <div class="caption text-center">
              <h3>Online Order</h3>
              <h4>(5% discount*)</h4>
              <p>Preview our <a href="menu.jsp">Menu</a></p>
              <p><a href="http://www.letsget.net/default.aspx?restaurantid=2359" class="btn btn-primary" role="button">Order Here</a>
            </div>
          </div>
        </div>
        <div class="col-sm-5 col-md-4">
          <div class="thumbnail">
            <img class="img-responsive img-rounded" src="imgs/mobile.jpg" alt="Delicious Meat">
            <div class="caption text-center">
              <h3>Mobile Order</h3>
              <h4>(5% discount*)</h4>
              <p>Preview our <a href="menu.jsp">Menu</a></p>
              <p class=><a href="http://www.letsget.net/default.aspx?restaurantid=2359&mobile=yes" class="btn btn-primary" role="button">Order Here</a>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- End Main Page Content -->

    <%@include file="footer.jsp"%>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>

</html>