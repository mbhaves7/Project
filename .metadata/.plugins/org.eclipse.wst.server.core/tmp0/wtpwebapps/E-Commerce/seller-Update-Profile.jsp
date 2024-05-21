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
					<li class="active">Profile</li>
				</ul>
			</div>
		</div>
	</div>
	<div class="page-section mb-60">
		<div class="container">
			<div class="row">

				<div class="col-sm-10 col-md-10 col-lg-10 col-xs-10">
					<form action="sellerController" method="post">

						<div class="login-form">
							<h4 class="login-title">Update Profile</h4>
							<div class="row">
								<input type="hidden" name="id" value=<%=s.getSid()%>>
								<div class="col-md-6 col-12 mb-20">
									<label>Name</label> <input class="mb-0" type="text"
										placeholder="Enter Name" name="name" value="<%=s.getName()%>">
								</div>
								<div class="col-md-6 col-12 mb-20">
									<label>Contact</label> <input class="mb-0" type="text"
										placeholder="Enter contact" name="contact"
										value="<%=s.getContact()%>">
								</div>
								<div class="col-md-6 mb-20">
									<label>Email Address</label> <input class="mb-0" type="email"
										placeholder="Email Address" name="email"
										value=" <%=s.getEmail()%>">
								</div>

								<div class="col-md-6 mb-20">
									<label>City</label> <input class="mb-0" type="city" name="city"
										placeholder="Enter City" value="<%=s.getCity()%>">
								</div>
								<div class="col-md-6 mb-20">
									<label>Address</label> <input class="mb-0" type="address"
										name="address" placeholder="Enter Address"
										value="<%=s.getAddress()%>">
								</div>
								<div class="col-12">
									<button class=" btn btn-primary mt-0" name="action"
										value="update">Update</button>
								</div>

							</div>


						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>