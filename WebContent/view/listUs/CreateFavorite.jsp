<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>
<body>


	<main class="container">
		<section class="row">
			<div class="col">
				<div class="row p-2">
					<c:forEach items="${ listVideo }" var="video">
						<div class="col-3 mt-2">
							<div class="card">
								<div class="card-body">
									<iframe src="${ video.poster }" class="img-fluid"> </iframe>
									<div class="row" style="height: 10vh;">
										<h4 class="card-title">
											<a href="/Ass/Home/VideoSVlet?id=${ video.id }">
										</h4>
										<p class="card-text">${ video.title }</p>
									</div>
								</div>
								<div class="card-footer text-muted">
									<a href="/Ass/LikeVideoSVlet" class="btn btn-primary">UnLike</a>
									<a href="/Ass/Send" class="btn btn-info">Share</a>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</section>
	</main>


	<div>
		<ul class="pagination">
			<li class="page-item"><a
				href="/Ass/Home?page=${ page - 1 }"
				class="btn btn-outline-primary">Previous</a></li>
			<li class="page-item"><a class="btn btn-outline-primary">..
					${ page } ..</a></li>
			<li class="page-item"><a
				href="/Ass/Home?page=${ page + 1 }"
				class="btn btn-outline-primary">Next</a></li>
		</ul>

	</div>
</body>
</html>


