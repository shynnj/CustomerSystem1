<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="../js/error.js"></script>
<body>
	<div class="container">
		<div class="container">
			<h2>Training</h2>
			<hr>
			<p>Login</p>
			
			<form class="form-control" name="myForm"
				 style="text-align: center"
				action="../T001" method="post">
				<h3 class="text-center">LOGIN</h3>
				<div class="row">
					<label id="lblError"></label>
				</div>
				<div class="row">
					<div class="form-group">
						<label>User Id:</label> <input id="txtUserID" name="txtUserID"
							style="margin-left: 14px" type="text" value="" />
					</div>
					<div class="form-group" style="margin-top: 10px;">
						<label>Password:</label> <input id="txtPassword"
							name="txtPassword" type="password" value="" />
					</div>
				</div>
				<div class="row">
					<div class="form-group" style="margin-top: 20px">
						<input type="submit" id="btnLogin" style="margin-left: 50px"
							onclick="myFunction()" value="Login" />
						<input type="submit" onclick="myFunction1()" style="margin-left: 100px" value="Clear"/>
							
					</div>
				</div>
				<input name="action" value="login">
			</form>
			
		</div>
</body>

</html>