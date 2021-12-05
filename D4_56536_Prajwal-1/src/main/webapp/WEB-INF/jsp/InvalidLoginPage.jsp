<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>invalidLogin</title>
</head>
<body>
<h3 style="font-family: serif; ;color: green;">Invalid Login ...Redirecting to login page </h3>
<img alt="invalid Login" src="/images/invalid1.jpg" height="200" width="300">
<%response.setHeader("refresh","3;url="+"login"); %>
</body>
</html>