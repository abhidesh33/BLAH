<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<h2>List of all Vendors</h2>

	<table border="1">
		<thead>
			<tr>
				<td>Name</td>
				<td>Email</td>
				<td>City</td>
				<td>Phone No</td>
				<td>Update</td>
				<td>Delete</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="vendor" items="${list}">
				<tr>
					<td>${vendor.name}</td>
					<td>${vendor.email}</td>
					<td>${vendor.city}</td>
					<td>${vendor.cell_no}</td>
					<td><a href="/update?email=${vendor.email}">Update</a></td>
					<td><a href="/delete?email=${vendor.email}">Delete</a></td>
				</tr>

			</c:forEach>
		</tbody>
	</table>
	<br />
	<a href="/logout">Sign Out</a>
</body>
</html>

