<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="user-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>

	<div class="page-section mb-60">
		<div class="container">
			<h2 class="mb-4">Registration Form</h2>
			<%
						String msg1 = (String) request.getAttribute("msg1");
						%>
						<%
						if (msg1 != null) {
						%>
						<h3 align="center">
							<%
							out.print(msg1);
							%>
						</h3>
						<%
						}
						%>

						<%
						String msg2 = (String) request.getAttribute("msg2");
						%>
						<%
						if (msg2 != null) {
						%>
						<h3 align="center">
							<%
							out.print(msg2);
							%>
						</h3>
						<%
						}
						%>
			<form action="UserController" method="post">

				<div class="col-md-10 login-form">
					<div class="form-row">
						
						<div class="form-group col-md-6">
							<label for="firstName">First Name</label> <input type="text"
								class="form-control" id="firstName" placeholder="First Name"
								name="first_name" required>
						</div>
						<div class="form-group col-md-6">
							<label for="lastName">Last Name</label> <input type="text"
								class="form-control" id="lastName" placeholder="Last Name"
								name="last_name" required>
						</div>
					</div>
					<div class="form-group">
						<label for="email">Email</label> <input type="email"
							class="form-control" id="email" placeholder="Email" name="email"
							required>
					</div>
					<div class="form-group">
						<label for="contact">Mobile</label> <input type="text"
							class="form-control" id="contact" placeholder="contact Number"
							name="contact" required>
					</div>
					<div class="form-group">
						<label for="address">Address</label>
						<textarea class="form-control" id="address" rows="3"
							name="address" placeholder="Address" required></textarea>
					</div>
					<div class="form-group">
						<label>Gender</label>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio" name="gender"
								id="male" value="male" required> <label
								class="form-check-label" for="male">Male</label>
						</div>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio" name="gender"
								id="female" value="female"> <label
								class="form-check-label" for="female">Female</label>
						</div>
					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="password">Password</label> <input type="password"
								name="newp" class="form-control" id="password"
								placeholder="Password" required>
						</div>
						<div class="form-group col-md-6">
							<label for="confirmPassword">Confirm Password</label> <input
								type="password" name="confirmnp" class="form-control"
								id="confirmPassword" placeholder="Confirm Password" required>
						</div>
					</div>
					<br>
					<button type="submit" class="btn btn-primary" name="action"
						value="register">signUp</button>


					<div class="text-center">
						<h5>Already have an account ?</h5>
						<a
							class="   text-primary  link-offset-2 link-offset-3-hover link-underline link-underline-opacity-0 link-underline-opacity-75-hover"
							href="user-login.jsp"> Sign in </a>
					</div>
				</div>
			</form>
		</div>
	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


</body>
</html>