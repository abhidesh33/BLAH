<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Hello ,${LoggedUser.name}</h2>
	<img alt="logout" src="images/logout.png" height="200" width="300">
	<h2 style="font-family: serif; color: green; font-size: x-large;">Logging
		off ..</h2>
	 <%response.setHeader("refresh","3;url="+"login");%>


</body>
</html>