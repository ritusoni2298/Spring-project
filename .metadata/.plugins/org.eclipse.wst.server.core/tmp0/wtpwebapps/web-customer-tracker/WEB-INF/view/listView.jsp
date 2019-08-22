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
	
	<!-- put a add button -->
	<input type="button" value="Add Customer" 
		onclick="window.location.href='showFormForAdd'; return false;"
		class="add-button"
	/>
	<table>
			<tr>
				<th> First Name </th>
				<th> Last Name </th>
				<th> Email </th>
				<th> Action </th>
			</tr>
			  	<c:forEach var="temp" items="${customers}">
			  	
			  	<c:url var="updateLink" value="/customer/showFormForUpdate">
			  		<c:param name="customerId" value="${temp.id}" />
			  	</c:url>
			  	
			  	
			  	<c:url var="deleteLink" value="/customer/delete">
			  		<c:param name="customerId" value="${temp.id}" />
			  	</c:url>
				<tr>
					<td> ${temp.first_name} </td>
					<td> ${temp.last_name} </td>
					<td> ${temp.email} </td>
					<td> <a href= "${updateLink}"> Update </a>
					| <a href ="${deleteLink}" onClick= "if (!(confirm('Are you sure?'))) return false"> Delete </a></td>
				</tr>
			</c:forEach>
	</table>
 	</div>
</div>
</body>
</html>