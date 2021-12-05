<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Update Vendor Details</h3>
	<hr>
	<sf:form modelAttribute="ven" action="/update" method="post">
		<table>

			<tr>
				<td>Name : </td>
				<td><sf:input path="name"/></td>
			</tr>
			<tr>
				<td>Email : </td>
				<td><sf:input path="email" readonly="true"/></td>
			</tr>
			<tr>
				<td>City : </td>
				<td><sf:input path="city"/></td>
			</tr>
			<tr>
				<td>Contact : </td>
				<td><sf:input path="cell_no" /> </td>
			</tr>
			<tr>
				<td>Reg-Amount : </td>
				<td><sf:input type = "number" path="reg_amount" /></td>
			</tr>
			<tr>
				<td>Reg-Date : </td>
				<td><sf:input path="reg_date" type="text"/></td>
			</tr>
		
		</table>
		<br>
		<input type="submit" value="Update">
	</sf:form>

	
</body>
</html>