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
	<section id="section-hero" aria-label="section" class="jarallax">
		<img src="images/background/2.jpg" class="jarallax-img" alt="">
		<div class="v-center">
			<div class="container">
				<div class="row align-items-center">
					<div class="col-lg-6 offset-lg-4">
						<div class="padding40 rounded-3 shadow-soft"
							data-bgcolor="#ffffff">
							<h4>Customer Login</h4>
							<div class="spacer-10"></div>
							<form id="form_register" class="form-border" method="post"
								action="account-dashboard.html">
								<div class="field-set">
									<input type="text" name="name" id="name" class="form-control"
										placeholder="Your Name" required>
								</div>
								<div class="field-set">
									<input type="password" name="password" id="password"
										class="form-control" placeholder="Enter Password" required>
								</div>
								<div id="submit">
									<input type="submit" id="send_message" value="Sign In"
										class="btn-main btn-fullwidth rounded-3" />
								</div>
							</form>
							<br>
							<div class="row g-2">
								<div class="col-lg-8">
									<a href="Customer-Forgot-password.jsp">Forgotten password?</a>
								</div>

							</div>
							<div class="title-line">sign&nbsp;in&nbsp;Or&nbsp;sign&nbsp;up&nbsp;</div>
							<div class="col-lg-6 ">
								<h5>Already have Business account?</h5>
								<a href="seller-login.jsp">Sign in</a>
							</div>

							<div class="row g-2">
								<div class="col-lg-8">
									<h5>New Customer?</h5>
									<a href="customer-register.jsp">Sign up</a>
								</div>
								<div class="col-lg-8 ">
									<h5>New to Business?</h5>
									<a href="Seller-Registration.jsp">Create Business Account</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<%@include file="index-footer.jsp"%>
</body>
</html>