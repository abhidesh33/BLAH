<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>adminLogin</title>
<style>
html {
	font-family: sans-serif;
}

table {
	border-collapse: collapse;
	border: 2px solid rgb(200, 200, 200);
	letter-spacing: 1px;
	font-size: 0.8rem;
}

td, th {
	border: 1px solid rgb(190, 190, 190);
	padding: 10px 20px;
}

td {
	text-align: center;
}

caption {
	padding: 10px;
}
</style>
</head>
<body>

	<h3 style="font-family: serif;; color: fuchsia;">Hello
		${LoggedUser.name}</h3>
	<hr>

	
	<table border="1">
		<colgroup>
			<col style="background-color: #97DB9A;">
			<col span="2">
			<col style="background-color: #97DB9A;">
			<col style="background-color: #DCC48E; border: 4px solid #C1437A;">

			<col style="background-color: #DCC48E; border: 4px solid #C1437A;">

		</colgroup>
		
		<thead>
		 
			<tr>
				<td>Name</td>
				<td>Email</td>
				<td>City</td>
				<td>Contact</td>
				<td>#</td>
				<td>#</td>
			</tr>
		</thead>
		<tbody>
		
			<c:forEach var="ven" items="${vList}">
			<tr><td></td></tr>
				<tr>
					<td>${ven.name}</td>
					<td>${ven.email}</td>
					<td>${ven.city}</td>
					<td>${ven.cell_no}</td>
					<td><a href="/update?email=${ven.email}">Update</a></td>
					<td><a href="/delete?email=${ven.email}">Delete</a></td>
				</tr>

			</c:forEach>
		</tbody>
	</table>
	<br>
	<div>
	<hr>
		<a href="/addVendor"  
				style="font-family: serif; color: green; font-size: x-large;">Add New Vendor </a>
				&nbsp  &nbsp &nbsp &nbsp &nbsp<a href="/logout" style="font-family: serif; color: highlight; ; font-size: x-large;"> log out </a>
	</div>

</body>
</html>