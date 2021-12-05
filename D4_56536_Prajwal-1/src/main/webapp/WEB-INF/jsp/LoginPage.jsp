<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
 <%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet" href="/css/site.css">
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
 <img alt="welcome" src="/images/welcome.png" height="200" width="300">
	  <sf:form action="validate" method="post" modelAttribute="userCred"> 
		<table>
			<tr>	
				<td>Email:</td>
				<td><sf:input path="email"/></td>
				<td><sf:errors cssClass="error"  path="email"/></td>
				
			</tr>
			<tr>	
				<td>Password:</td>
				<td><sf:password path="password"/></td>
				<td><sf:errors  cssClass="error"   path="password"/></td>
			</tr>
			<tr>	
				<td colspan="2">
					<input type="submit" value="Sign In"/>
					
				</td>
			</tr>
		</table>
	</sf:form>
</body>
</html>
