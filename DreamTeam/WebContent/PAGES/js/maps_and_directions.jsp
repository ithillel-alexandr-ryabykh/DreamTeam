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
        <div class="col-md-offset-1 col-md-5">
          <div class="thumbnail">
            <div class="caption">
              <h3>Restaurant Address:</h3>
              <p><a href="https://www.google.com/maps/place/Mr.+Chef's+Fine+Chinese+Cuisine+%26+Bar/@25.948894,-80.143161,17z/data=!3m1!4b1!4m2!3m1!1s0x88d9ac56291052c7:0xd557dc5dc02faf8e" target="_blank">18800 NE 29th AVE, Suite 10 <br> Aventura, FL 33180</a> <br> Back of Loehamnn's Fashion Island (South East Corner). Ground floor of the Venture Condo (East Tower) east side of the Sakes Fifth Avenue's and south side of Publix.</p>
            </div>
            <div class="google-maps">
              <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d3587.583596313946!2d-80.14316099999999!3d25.948894!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x88d9ac56291052c7%3A0xd557dc5dc02faf8e!2sMr.+Chef&#39;s+Fine+Chinese+Cuisine+%26+Bar!5e0!3m2!1sen!2sus!4v1424666693133" width="450" height="450" frameborder="0" style="border:0"></iframe>
            </div>
          </div>
        </div>
        <div class="col-md-5">
          <div class="thumbnail">
            <div class="caption">
              <h3>Driving Directions:</h3>
              <p>Along Biscayne Blvd (US1), turn east onto NE 187th Street. Drive all the way to the end merging to NE 29th Ave. Pass the first traffic light (NE 188th ST), and go to the left/west side of NE 29th Avenue. We are located at the ground floor of the Venture Condominium (East Tower in light yellow color with 10 floors) at the corner Suite #10.</p>
            </div>
            <img class="img-responsive" src="imgs/map.jpg" alt="Map of Directions">
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
