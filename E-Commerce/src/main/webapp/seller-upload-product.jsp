<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="seller-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="breadcrumb-area">
		<div class="container">
			<div class="breadcrumb-content">
				<ul>
					<li><a href="index.jsp">Home</a></li>
					<li class="active">Login</li>
				</ul>
			</div>
		</div>
	</div>
	<div class="page-section mb-60">
		<div class="container">
			<div class="row">
				<div class="col-sm-10 col-md-10 col-lg-10 col-xs-10">


					<div class="login-form">
						<div class="col-12">
							<h4 class="contact-title">Seller Upload Product</h4>
						</div>
						<div class="col-lg-8">
							<form action="ProductController" method="post"
								enctype="multipart/form-data">
								<div class="row">

									<input type="hidden" name="sid" value="<%=s.getSid()%>">
									<div class="col-8">
										<div class="form-group">
											<input class="form-control" name="image" id="subject"
												type="file">
										</div>
									</div>
									<div class="col-8">
										<div class="form-group">
											<input class="form-control" name="pname" id="subject"
												type="text" placeholder="Product Name">
										</div>
									</div>
									<div class="col-8">
										<div class="form-group">
											<input class="form-control" name="pprice" type="text"
												placeholder="Product Price">
										</div>
									</div>
									<div class="col-8">
										<div class="form-group">
											<input class="form-control" name="pcategory" id="subject"
												type="text" placeholder="Product Category">
										</div>
									</div>
									<div class="col-8">
										<div class="form-group">
											<textarea class="form-control" name="pdesc" id="subject"
												type="text" placeholder="Product Description"></textarea>
										</div>
									</div>

								</div>
								<div class="form-group mt-3">
									<button type="submit"
										class="button button-contactForm boxed-btn" name="action"
										value="upload product">Upload</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>
</body>
</html>