<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="Client-Header.jsp"%>
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
					<li class="active">Change Password</li>
				</ul>
			</div>
		</div>
	</div>
	<div class="page-section mb-60">
		<div class="container">
			<div class="row">

				<div class="col-sm-8 col-md-10 col-lg-10 col-xs-10">
					<form action="ClientController" method="post">

						<div class="login-form">

							<input type="hidden" name="id" value=<%=c.getId()%>>
							<h4 class="login-title">Change Password</h4>
							<%
							String msg = (String) request.getAttribute("msg");
							%>

							<%
							if (msg != null) {
							%>
							<h2>
								<%
								out.print(msg);
								%>
								<%
								}
								%>
							</h2>

							<h2>
								<%
								String msg1 = (String) request.getAttribute("msg1");
								%>

								<%
								if (msg1 != null) {
								%>
								<%
								out.print(msg1);
								%>
								<%
								}
								%>
							</h2>

							<div class="row">
								<div class="col-md-8 mb-20">
									<label>Old Password*</label> <input class="mb-0"
										type="password" placeholder="Password" name="op" required>
								</div>
								<div class="col-md-8 mb-20">
									<label>New Password*</label> <input class="mb-0"
										type="password" id="password1" placeholder="New Password"
										name="np" required>
								</div>
								<div class="col-md-8 mb-20">
									<label>Confirm New Password*</label> <input class="mb-0"
										type="password" id="password1"
										placeholder="Confirm New Password" name="cnp" required>
								</div>
								<div class="col-12">
									<button class=" btn btn-primary mt-0" name="action" value="cp">Change
										Password</button>
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