<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
	    <meta charset="utf-8">
	    <title>Sign in &middot; Twitter Bootstrap</title>
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <meta name="description" content="">
	    <meta name="author" content="">

	<!-- SignIn -->
	<link href="css/signin.css" rel="stylesheet">
    
    <!-- Bootstrap -->
  	<link href="bootstrap/docs/assets/css/bootstrap.css" rel="stylesheet">
  	<link href="bootstrap/docs/assets/css/bootstrap-responsive.css" rel="stylesheet">
  	
	<!-- JavaScript -->
	<script src="bootstrap/docs/assets/js/bootstrap.js"></script>

    <script src="bootstrap/docs/assets/js/jquery.js"></script>
    <script src="bootstrap/docs/assets/js/bootstrap-transition.js"></script>
    <script src="bootstrap/docs/assets/js/bootstrap-alert.js"></script>
    <script src="bootstrap/docs/assets/js/bootstrap-modal.js"></script>
    <script src="bootstrap/docs/assets/js/bootstrap-dropdown.js"></script>
    <script src="bootstrap/docs/assets/js/bootstrap-scrollspy.js"></script>
    <script src="bootstrap/docs/assets/js/bootstrap-tab.js"></script>
    <script src="bootstrap/docs/assets/js/bootstrap-tooltip.js"></script>
    <script src="bootstrap/docs/assets/js/bootstrap-popover.js"></script>
    <script src="bootstrap/docs/assets/js/bootstrap-button.js"></script>
    <script src="bootstrap/docs/assets/js/bootstrap-collapse.js"></script>
    <script src="bootstrap/docs/assets/js/bootstrap-carousel.js"></script>
    <script src="bootstrap/docs/assets/js/bootstrap-typeahead.js"></script> 
     	
  </head>

  <body>

    <div class="container">

      <form method="POST" action="http://localhost:8080/LuxStore/plp" class="form-signin">
       
        <h2 class="form-signin-heading">Please sign in</h2>
       
        <input type="text" class="input-block-level" placeholder="Email address">
        <input type="password" class="input-block-level" placeholder="Password" name="password">
       
        <label class="checkbox">
          <input type="checkbox" value="remember-me"> Remember me
        </label>
      
      Language :  
       <select name="Countries" multiple="multiple">
			<option value="FR">France</option>
			<option value="GB" selected>Great Britain</option>
			<option value="DK">Denmark</option>
		</select>

       
       <input type="submit" class="btn btn-large btn-primary" value="Sign in" />
      
      </form>

    </div>

  </body>
  
</html>
