<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>detailsPage</title>
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
	
	<h3 style="font-family: serif; color: green; font-size: x-large;">User Details :</h3>
	<table border="1">
	<colgroup>
        
        <col style="background-color:#97DB9A;border:4px solid #C1437A;">
        <col style="background-color:#DCC48E; border:4px solid #C1437A;">
        
      </colgroup>
		<tbody>
			<tr>
				<td>Email</td>
				<td>${LoggedUser.email}</td>
			</tr>

			<tr>
				<td>City</td>
				<td>${LoggedUser.city}</td>
			</tr>

			<tr>
				<td>Contact</td>
				<td>${LoggedUser.cell_no}</td>
			</tr>

			<tr>
				<td>Reg_Date</td>
				<td>${LoggedUser.reg_date}</td>
			</tr>

			<tr>
				<td>Reg_Amount</td>
				<td>${LoggedUser.reg_amount}</td>
			</tr>

		</tbody>
	</table>
	<br>
	<a href="/logout" style="font-family: serif; color: green; font-size: x-large;"> log out </a>

</body>
</html>