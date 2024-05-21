<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="index-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section aria-label="section">
		<div class="container">
			<div class="row g-custom-x">

				<div class="de-box mb30 col-lg-8 mb-sm-30">
					<h3>Customer Create Account</h3>
					<form name="contactForm" id="contact_form" class="form-border"
						method="post" action="#">
						<div class="row">
							<div class="col-md-6 mb10">
								<div class="field-set">
									<input type="text" name="Name" id="name" class="form-control"
										placeholder="Enter Name" required>
								</div>
							</div>
							<div class="col-md-6 mb10">
								<div class="field-set">
									<input type="text" name="email" id="email" class="form-control"
										placeholder="Your email" required>
								</div>
							</div>
							<div class="col-md-6 mb10">
								<div class="field-set">
									<input type="password" name="password" id="password"
										class="form-control" placeholder=" Enter password" required>
								</div>
							</div>
							<div class="col-md-6 mb10">
								<div class="field-set">
									<input type="password" name="password" id="password"
										class="form-control" placeholder="Enter password" required>
								</div>
							</div>
							<div class="col-md-6 mb10">
								<div class="field-set">
									<input type="text" name="contact" id="contact"
										class="form-control" placeholder="Enter contact" required>
								</div>
							</div>
						</div>
						<div id='submit' class="mt20">
							<input type='submit' id='send_message' value='Sign Up'
								class="btn-main">
						</div>
						<div class="title-line"></div>
						<div class="row g-2">
							<div class="col-lg-6 ">
								<h5>Buying for work?</h5>
								<a href="seller-registration.jsp">Create Business Account</a>
							</div>
							<div class="col-lg-6 ">
								<h5>Already have customer account?</h5>
								<a href="customer-login.jsp">Sign in</a>
							</div>
						</div>
						<br>
						<div class="col-lg-6 ">
							<h5>Already have Business account?</h5>
							<a href="seller-login.jsp">Sign in</a>
						</div>
					</form>
				</div>
				<div class="col-lg-4">
					<div class="de-box mb30 ">
						<a href="images/background/carr12.jpg" class="image-popup"> <span
							class="dih-title-wrap"> <span class="dih-title">Gallery
									Title</span>
						</span> <span class="dih-overlay"></span> <img
							src="images/background/carr12.jpg" class="lazy img-fluid" alt="">
						</a>
					</div>
					<div class="de-box mb30">
						<span> <img src="images/background/caw.jpg"
							class="lazy img-fluid" alt=""></span>
					</div>
				</div>
			</div>
		</div>
	</section>
	<%@include file="index-footer.jsp"%>
</body>
</html>