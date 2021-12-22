<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<body>

	<h1>Details for a single employee</h1>
	
	<p>Name : ${employee.name}</p>
	<p>Job Role : ${employee.jobRole}</p>
	<p>Age : ${employee.age}</p>

	<br />
	<a href=${pageContext.request.contextPath}>Back to main menu</a>

</body>
</html>