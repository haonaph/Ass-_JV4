<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Layout</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>
<body>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">

		<div class="container-fluid">

			<a class="navbar-brand" href="#">PT15304-UD</a>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">

				<ul class="navbar-nav me-auto mb-2 mb-lg-0">

					<li class="nav-item"><a class="nav-link active"
						href="/Ass/Home">Home</a></li>
					<li class="nav-item"><a class="nav-link active"
						href="/Ass/FavoriteSVlet">My Favorite</a></li>

					<li class="nav-item dropdown ">
							<a class="nav-link dropdown-toggle" href="" id="dropdownId"
								data-toggle="dropdown" aria-haspopup="true"
								aria-expanded="false"> <i class="fa fa-user"
								aria-hidden="true"></i> My Account
							</a>
							<div class="dropdown-menu" aria-labelledby="dropdownId">
								<a class="dropdown-item" href="/Ass/Login">Login</a> <a
									class="dropdown-item" href="">Forgot Password</a> <a
									class="dropdown-item" href="/Ass/register">Registration</a> <a
									class="dropdown-item" href="/Ass/Login">Logoff</a> <a
									class="dropdown-item" href="/Ass/admin/users/update?id=${ user.id }">Change Password</a> <a
									class="dropdown-item" href="/Ass/admin/users">.Edit ...</a>
						</div>
					</li>
					<li class="nav-item"><a class="nav-link active"
						href="/Ass/admin/VideoManagerSVlet">Admin</a></li>
			</div>

		</div>

	</nav>

	<div class="col-12 row">
		<div class="col-2 ">Sidebar</div>

		<div class="col-10">
			<jsp:include page="${ view }" />
		</div>
	</div>

	<div>Footer</div>


	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>

</body>
</html>