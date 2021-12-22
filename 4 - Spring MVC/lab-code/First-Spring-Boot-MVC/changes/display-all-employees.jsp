<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<body>

	<h1>Details for all Employees</h1>
	<br />
	<table border="1" cellpadding="10">
		<tr>
			<th>Name</th>
			<th>Role</th>
			<th>Age</th>
		</tr>
		<c:forEach var="employee" items="${employees}">
			<tr>
				<td>${employee.name}</td>
				<td>${employee.jobRole}</td>
				<td>${employee.age}</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href=${pageContext.request.contextPath}>Back to main menu</a>

</body>
</html>