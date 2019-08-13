<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link type="text/css" rel= "stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">


<title>
List Customer</title>
</head>

<body>

<div id="wrapper">
	<div id="header">
	<h2>CRM -CUSTOMER RELATIONSHIP MANAGER</h2>
	</div>
</div>

<div id="one">
	<div id="container">
	<table>
			<tr>
				<th> First Name </th>
				<th> Last Name </th>
				<th> Email </th>
			</tr>
			  	<c:forEach var="temp" items="${customers}">
				<tr>
					<td> ${temp.first_name} </td>
					<td> ${temp.last_name} </td>
					<td> ${temp.email} </td>
				</tr>
			</c:forEach>
	</table>
 	</div>
</div>
</body>
</html>