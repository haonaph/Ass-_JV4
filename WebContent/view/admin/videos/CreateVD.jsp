<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">

<style>
h1 {
	text-align: center;
}
</style>
</head>
<body>

	<main class="container-fluid">
		<nav class="row">
			<nav class="navbar navbar-expand-sm navbar-light bg-light">
				<div class="collapse navbar-collapse" id="collapsibleNavId">
					<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
						<li class="nav-item"><a class="nav-link" href="#"><i
								class="fa fa-info" aria-hidden="true"></i>Video</a></li>

						<div class="nav item">
							<a href="/Ass/admin/users" class="nav-link"> <i class="fa fa-info"
								aria-hidden="true"></i>Users
							</a>
						</div>

					</ul>
				</div>
			</nav>
		</nav>
		<section class="row">
			<div class="col mt-4">
				<ul class="nav nav-tabs" id="myTab" role="tablist">
					<li class="nav-item" role="presentation"><a
						class="nav-link active" id="videoEditing-tab" data-toggle="tab"
						href="#videoEditing" role="tab" aria-controls="videoEditing"
						aria-selected="true">Video Editing</a></li>
					<li class="nav-item" role="presentation"><a class="nav-link"
						id="videoList-tab" data-toggle="tab" href="#videoList" role="tab"
						aria-controls="videoList" aria-selected="false">Video List</a></li>

				</ul>
				<div class="tab-content" id="myTabContent">
					<div class="tab-pane fade show active" id="videoEditing"
						role="tabpanel" aria-labelledby="videoEditing-tab">
						<form action="" method="post">
							<div class="card">
								<div class="card-body">
									<div class="row">

										<div class="col-12">

											<div class="col-6 offset-3">

												<form action="/Ass/admin/VideoManagerSVlet" method="post">

													<div class="mt-3">

														<label for="title" class="form-label">title</label> <input
															type="text" value="${ video.title }" class="form-control" id="title" name="title" />

													</div>

													<div class="mt-3">

														<label for="poster" class="form-label">poster</label> <input
															type="text" value="${ video.poster }" class="form-control" id="poster"
															name="poster" />

													</div>
													<div class="mt-3">

														<label for="view" class="form-label">view</label> <input
															type="text" value="${ video.view }" class="form-control" id="view" name="view" />

													</div>
													<div class="mt-3">

														<label for="description" class="form-label">description</label>
														<input type="text" value="${ video.description }" class="form-control" id="description"
															name="description" />

													</div>
													<div class="mt-3">

														<label for=active class="form-label">active</label> <input
															type="text" value="${ video.active }" class="form-control" id="active"
															name="active" />

													</div>

													<div class="mt-3">

														<button type="Create" class="btn btn-primary mb-3">

															Create</button>

													</div>

												</form>

											</div>

										</div>

									</div>
								</div>
							</div>
						</form>
					</div>
					<div class="tab-pane fade" id="videoList" role="tabpanel"
						aria-labelledby="videoList-tab">
						<table class="table table-stripe">
							<thead>
								<tr>
									<td>YTB ID</td>
									<td>Video Title</td>
									<td>View count</td>
									<td>Status</td>
									<td>&nbsp;</td>
								</tr>
							</thead>

							<tbody>
								<c:forEach items="${ listVideo }" var="video">

									<tr>
										<td>${ video.id }</td>
										<td>${ video.title }</td>
										<td>${ video.view }</td>
										<td>${ video.active }</td>
										<td><a href="/Ass/admin/VideoManagerSVlet/UpdateVideo?id=${ video.id }"><fa4-edit> <i
													class="btn btn-edit" aria-hidden="true"></i> Edit </fa4-edit></a> <a
											href="/Ass/admin/VideoManagerSVlet/DeleteVideo?id=${ video.id }"><i
												class="btn btn-trash" aria-hidden="true"></i>Delete</a></td>
									</tr>
								</c:forEach>
							</tbody>

						</table>
						<div>
							<ul class="pagination">
								<li class="page-item"><a
									href="/Ass/admin/VideoManagerSVlet?page=${ page - 1 }"
									class="btn btn-outline-primary">Previous</a></li>
								<li class="page-item"><a class="btn btn-outline-primary">..
										${ page } ..</a></li>
								<li class="page-item"><a
									href="/Ass/admin/VideoManagerSVlet?page=${ page + 1 }"
									class="btn btn-outline-primary">Next</a></li>
							</ul>

						</div>
					</div>
				</div>
			</div>
		</section>
		<footer class="row"></footer>
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

	<script>
		$('#myTab a').on('click', function(event) {
			event.preventDefault()
			$(this).tab('show')
		})
	</script>
</body>
</html>