<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<body>


	<h2>Employee form</h2>
	<hr>
	<br>

	<form:form action="processForm" modelAttribute="employee">

        Name: <form:input path="name" />
		<br/>
		<br/>
        Background : <form:textarea path="background" rows="4" cols="30" />
        <br/>
        <br/>
        Country of origin : <form:select path="country">
			<form:option value="USA" label="United States of America" />
			<form:option value="IND" label="India" />
			<form:option value="CHN" label="China" />
			<form:option value="AUS" label="Australia" />
		</form:select>

    <br/><br/>
		<input type="submit" value="Submit" />

	</form:form>


</body>
</html>