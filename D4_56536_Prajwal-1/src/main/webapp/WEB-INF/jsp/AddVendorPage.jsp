<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Vendor</title>

</head>
<body>
	<h3>Update Vendor Details</h3>
	<hr>
	<sf:form modelAttribute="ven" action="/addVendor" method="post">
		<table>
			<tr>
				<td>Name : </td>
				<td><sf:input path="name"/></td>
			</tr>
			<tr>
				<td>Email : </td>
				<td><sf:input path="email" /></td>
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
				<td><sf:input path="reg_amount" /></td>
			</tr>
			<tr>
				<td>Reg-Date : </td>
				<td><sf:input path="reg_date" type="date"/></td>
			</tr>
		<tr>
				<td>Role : </td>
				<td><sf:input path="role"/></td>
			</tr>
			<tr>
				<td>password : </td>
				<td><sf:input path="password"/></td>
			</tr>
		</table>
		<br>
		<input type="submit" value="Update">
	</sf:form>
	
</body>
</html>