<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="Header.jsp"%>
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
					<li class="active">Register</li>
				</ul>
			</div>
		</div>
	</div>
	<div class="page-section mb-60">
		<div class="container">
			<div class="row">

				<div class="col-sm-10 col-md-10 col-lg-10 col-xs-10">
					<form action="ClientController" method="post">
						<%
						String msg = (String) request.getAttribute("msg");
						%>
						<%
						if (msg != null) {
						%>
						<h3 align="center">
							<%
							out.print(msg);
							%>
						</h3>
						<%
						}
						%>
						<div class="login-form">
							<h4 class="login-title">Registration</h4>
							<div class="row">

								<div class="col-md-6 col-12 mb-20">
									<label>First Name</label> <input class="mb-0" type="text"
										placeholder="First Name" name="fname">
								</div>
								<div class="col-md-6 col-12 mb-20">
									<label>Last Name</label> <input class="mb-0" type="text"
										placeholder="Last Name" name="lname">
								</div>
								<div class="col-md-6 mb-20">
									<label>Email Address*</label> <input class="mb-0" type="email"
										placeholder="Email Address" name="email" required>
								</div>
								<div class="col-md-6 mb-20">
									<label>Password</label> <input class="mb-0" type="password"
										id="password1" placeholder="Password" name="password" required>
								</div>
								<div class="col-md-6 mb-20">
									<label>City</label> <input class="mb-0" type="city" name="city"
										placeholder="Enter City">
								</div>
								<div class="col-md-6 mb-20">
									<label>Contact</label> <input class="mb-0" type="contact"
										name="contact" placeholder="Enter contact">
								</div>
								<div class="col-12">
									<button class=" btn btn-primary mt-0" name="action"
										value="register">Sign Up</button>
								</div>
							</div>
							<div class="text-center">
								<p class="text-center">
								<h6>Buying for work?</h6>
								<a
									class="   text-primary  link-offset-2 link-offset-3-hover link-underline link-underline-opacity-0 link-underline-opacity-75-hover"
									href="Seller-Registration.jsp"> Create a free business
									account </a>
								</p>
							</div>
							<div class="text-center">
								<h5>Already have an account?</h5>
								<a
									class="   text-primary  link-offset-2 link-offset-3-hover link-underline link-underline-opacity-0 link-underline-opacity-75-hover"
									href="customer-login.jsp"> Sign in </a>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>