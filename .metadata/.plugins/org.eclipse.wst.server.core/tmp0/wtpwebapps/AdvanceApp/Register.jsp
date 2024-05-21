<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<style>
.centered {
	justify-content: center;
}
</style>
<title>Insert title here</title>
</head>
<body>


	<border>
	<div class="form-content">
		<h1>
			<center>Sign Up</center>
		</h1>
	</div>
	<%
	String msg = (String) request.getAttribute("msg");
	%> <%
 if (msg != null) {
 %>
	<h3 align="center">
		<%
		out.print(msg);
		%>
	</h3>
	<%
	}
	%> </border>
	<div class="container">
		<div class="row justify-content-center">
			<form class="col-md-6 text-center" action="AdminController"
				method="post">
				<div class=" mb-4">
					<input type="text" class="form-control" placeholder="First Name"
						name="fname" />
				</div>
				<div class=" mb-4">
					<input type="text" class="form-control" placeholder="Last Name"
						name="lname" />
				</div>
				<div class=" mb-4">
					<input type="email" class="form-control" placeholder="Enter Email"
						name="email" />
				</div>

				<div class=" mb-4">
					<input class="form-control" type="password"
						placeholder="Enter Password " name="password" />
				</div>

				<div class="row mb-4">
					<div class="col center">
						<div class="form-check">
							<input class="form-check-input" type="checkbox" value=""
								id="form2Example31" checked /> <label class="form-check-label"
								for="form2Example31"> Remember me </label>
						</div>
					</div>

					<div class="col">
						<a href="#!">Forgot password?</a>
					</div>
				</div>
				<div class="col-sm-6 text-center">
					<button type="submit" class="btn btn-primary" name="action"
						value="register">Sign Up</button>
				</div>
				<div class="text-center">
					<p>
						Not a member? <a href="Login.jsp">Register</a>
					</p>

				</div>

			</form>
		</div>

	</div>
</body>
</html>

