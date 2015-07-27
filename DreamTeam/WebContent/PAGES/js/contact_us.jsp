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
        <div class="col-sm-offset-2 col-sm-4 col-md-offset-2 col-md-4">
          <div class="panel panel-default">
            <div class="panel-heading">
              <h3 class="panel-title">Contact Us</h3>
            </div>
            <div class="panel-body">
              <h5>Mr. Chef's Fine Chinese Cuisine & Bar</h5>
              <p>18800 NE 29 AVE, Suite 10 <br> Aventura, FL 33180 <br> Tel: (786) 787-9030 <br> Fax: (786) 787-9070 <br> info@aventurachef.com</p>
            </div>
          </div>
        </div>
        <div class="col-md-2"></div>
      </div>
    </div>
    <form class="container form-horizontal">
      <div class="form-group">
        <label for="inputFirst_Name3" class="col-sm-2 control-label">*First Name</label>
        <div class="col-sm-5">
          <input type="first_name" class="form-control" id="inputFirst_Name3" placeholder="Mr.">
        </div>
      </div>
      <div class="form-group">
        <label for="inputLast_Name3" class="col-sm-2 control-label">*Last Name</label>
        <div class="col-sm-5">
          <input type="last_name" class="form-control" id="inputLast_Name3" placeholder="Chef">
        </div>
      </div>
      <div class="form-group">
        <label for="inputEmail3" class="col-sm-2 control-label">*Email</label>
        <div class="col-sm-5">
          <input type="email" class="form-control" id="inputEmail3" placeholder="info@aventurachef.com">
        </div>
      </div>
       <div class="form-group">
        <label for="inputPhone_Number3" class="col-sm-2 control-label">Phone Number</label>
        <div class="col-sm-5">
          <input type="phone_number" class="form-control" id="inputPhone_Number3" placeholder="(786)-787-9030">
        </div>
      </div>
      <div class="form-group">
        <label for="inputMessage3" class="col-sm-2 control-label">*Message</label>
        <div class="col-sm-5">
          <textarea class="form-control" rows="10" placeholder=""></textarea>
        </div>
      </div>
      <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
          <button type="button" class="btn btn-default" data-toggle="modal" data-target="#myModal">
            Submit
          </button>
          <!-- Modal -->
            <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">Thank you!</h4>
                  </div>
                  <div class="modal-body">
                    We will try to respond to your request as soon as possible. Please be sure that info@aventurachef.com is not in your email's spam folder. 
                  </div>
                  <div class="modal-footer">
                    <a href="contact_us.jsp" class="btn btn-default" role="button">Close</a>
                  </div>
                </div>
              </div>
            </div>
          <!-- End Modal -->
        </div>
      </div>
    </form>
    <!-- End Main Page Content -->

    <%@include file="footer.jsp"%>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>

</html>
