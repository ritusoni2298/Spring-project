<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE>
<html>
<head>
<Title> Save Customer</Title>

<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"> 
</head>
<body>

<div id="wrapper">
	<div id="header">
		<h2>	CRM - CUSTOMER RELATIONSHIP MANAGER</h2> 
	</div>

</div>

<div id="one">
	<div id="container">
		<h3> Save Customer </h3>
		<form:form action="saveCustomer" modelAttribute="customers" method="POST">
			<form:hidden path="id" />
		<table>
			<tbody>
				<tr>
				<td> <label> First Name : </label></td>
				<td> <form:input path="first_name" /></td>
				</tr>
				
				<tr>
				<td> <label> Last Name : </label></td>
				<td> <form:input path="last_name" /></td>
				</tr>
				
				<tr>
				<td> <label> Email : </label></td>
				<td> <form:input path="email" /></td>
				</tr>
				
				<tr>
				<td> <label> </label></td>
				<td> <input type="submit" value="save" class="save" /></td>
				</tr>
			</tbody>
		</table>
		
		</form:form>
		
		<div style="clear; both;">
		</div>
		
		<p>
			<a href="${pageContext.request.contextPath}/customer/list"> Back to List</a>
		 </p>
		
	</div>
</div>



</body>
</html>