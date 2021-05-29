<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
	
	<style>
h1 {text-align: center;}
</style>
</head>
<body>
     <div >
     <h1>Sign up</h1>
     </div>

	<div class="row">

		<div class="col-12">

			<div class="col-6 offset-3">

				<form action="/Ass/register" method="post">

					<div class="mt-3">

						<label for="name" class="form-label">Name</label> <input
							type="text" class="form-control" id="name" name="name" />

					</div>

					<div class="mt-3">

						<label for="email" class="form-label">Email</label> <input
							type="email" class="form-control" id="email" name="email" />

					</div>

					<div class="mt-3">

						<label for="password" class="form-label">Password</label> <input
							type="password" class="form-control" id="password"
							name="password" />

					</div>

					<div class="form-check mt-3">

						<input class="form-check-input" type="checkbox" value=""
							id="flexCheckChecked" checked> <label
							class="form-check-label" for="flexCheckChecked"> Receive
							email? </label>

					</div>

					<div class="mt-3">

						<button type="submit" class="btn btn-primary mb-3">

							Sign up</button>

					</div>

				</form>

			</div>

		</div>

	</div>
</body>
</html>