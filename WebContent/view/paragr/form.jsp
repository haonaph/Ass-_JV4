<%@ page pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<title>Title</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<main class="container">

		<div class="row">

			<div class="col-8">

				<div class="card text-center mt-3">
						<div class="card-body">

							<div class="row" style="height: 40vh;">
								<iframe src="${ video.poster }" class="card-img-top"> </iframe>
							</div>
							<div class="row p-2">
								<h2>${ video.title }</h2>
							</div>
							<div class="row p-2">
								<b>${ video.description }</b>
							</div>
						</div>
						<div class="card-footer text-right">
							<a href="" class="btn btn-success">Like</a> <a href="/Ass/Send"
								class="btn btn-info">Share</a>
						</div>
				</div>
			</div>

			<div class="col-4">

				<div class="row mt-3 mb-3">
					<div class="col-2">
						<iframe src="${ video.poster }" class="imh-fluid"> </iframe>
					</div>
					<div class="col-10 border-left">${ video.id }</div>
				</div>

			</div>

		</div>

	</main>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
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