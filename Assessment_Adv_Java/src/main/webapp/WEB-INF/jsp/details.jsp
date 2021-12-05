<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hello, ${user.name} <hr/>

	<h4>${user.name}</h4>
	<h5>${user.email}</h5>
	<div>
		Address : ${user.city}
	</div>
	<div>
		Contact : ${user.cell_no}
	</div>
	<hr/>
	<div>
		Date :${user.reg_date}
	</div>
<br>
	<a href="/logout">Sign Out</a>
	
</body>
</html>
