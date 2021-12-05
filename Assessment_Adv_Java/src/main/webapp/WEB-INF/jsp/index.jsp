<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>
</head>
<body>
	<sf:form method="post" modelAttribute="command" action="login">

		<h1>Welcome</h1>
		<br>
		<br>
		<h3>
			<a href="/login">User Login:</a>
		</h3>
	</sf:form>
</body>
</html>