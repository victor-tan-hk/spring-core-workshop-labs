<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>

<h2>Retrieve a single employee</h2>

    <form action="processSingleEmployee" method="POST">

        Name: <input type="text" name="employeeName" /> 
        <br /><br />
        
        <input type="submit" value="Submit" />

    </form>
	<br />
	<a href=${pageContext.request.contextPath}>Back to main menu</a>


</body>
</html>