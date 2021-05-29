<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update User</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
</head>
<body>

	<div class="row">

		<div class="col-12">

			<div class="col-6 offset-3">

				<form action="/Ass/admin/users/update?id=${ user.id }" method="post">

					<div class="mt-3">

						<label for="name" class="form-label">Name</label> <input
							type="text" value="${ user.name }" class="form-control" id="name"
							name="name" />

					</div>

					<div class="mt-3">

						<label for="email" class="form-label">Email</label> <input
							type="email" value="${ user.email }" class="form-control"
							id="email" name="email" />

					</div>

					<div class="mt-3">

						<label for="password" class="form-label">Password</label> <input
							type="password" value="${ user.password }" class="form-control"
							id="password" name="password" />

					</div>

					<div class="mt-3">

						<button type="submit" class="btn btn-primary mb-3">
							Update</button>

					</div>

				</form>

			</div>

		</div>

	</div>
</body>
</html>