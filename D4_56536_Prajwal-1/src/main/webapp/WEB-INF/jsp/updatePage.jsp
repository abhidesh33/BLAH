<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Vendor</title>
 <style>
    html {
      font-family: sans-serif;
    }

    table {
      border-collapse: collapse;
      border: 2px solid rgb(200,200,200);
      letter-spacing: 1px;
      font-size: 0.8rem;
    }

    td, th {
      border: 1px solid rgb(190,190,190);
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
	<h3>Update Vendor Details</h3>
	<hr>
	<sf:form modelAttribute="ven" action="/update" method="post">
		<table>
		<colgroup>
        <col span="2">
        <col style="background-color:#97DB9A;">
        <col style="width:42px;">
        <col style="background-color:#97DB9A;">
        <col style="background-color:#DCC48E; border:4px solid #C1437A;">
        <col span="2" style="width:42px;">
      </colgroup>
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
		</table>
		<br>
		<input type="submit" value="Update">
	</sf:form>
	
	
</body>
</html>