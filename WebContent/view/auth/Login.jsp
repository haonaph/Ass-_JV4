<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</style>
</head>

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<body>
	<div id="login">
		<h3 class="text-center text-white pt-5">Login form</h3>
		<div class="container">
			<div id="login-row"
				class="row justify-content-center align-items-center">
				
				<div id="login-column" class="col-md-6">
					<div id="login-box" class="col-md-12">
					<div class="alert alert-${ alert }">
					<strong>${ message }</strong>
				</div>
						<form id="login-form" class="form" action="/Ass/Login"
							method="post">
							<h3 class="text-center text-info">Login</h3>
							<div class="form-group">
								<label for="email" class="text-info">Email address:</label><br>
								<input type="text" name="email" id="username"
									class="form-control">
							</div>
							<div class="form-group">
								<label for="password" class="text-info">Password:</label><br>
								<input type="password" name="password" id="password"
									class="form-control">
							</div>
							<div class="form-group">
								<span><input id="remember-me" name="remember-me"
									type="checkbox"></span> <label for="remember-me"
									class="text-info"><span>Remember me</span> </label><br> <input
									type="submit" name="submit" class="btn btn-info btn-md"
									value="Submit">
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>