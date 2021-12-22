<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>

<h2>Enter details for a new employee</h2>

    <form action="processNewEmployee" method="POST">

        Name: <input type="text" name="employeeName" /> 
        <br /><br />
         
        <label for="role">Employee job role :</label> 
        <select id="role" name="employeeRole">
            <option value="Developer">Developer</option>
            <option value="Tester">Tester</option>
            <option value="Project Manager">Project Manager</option>
        </select> 
        <br /><br /> 
        
        <label for="employeeAge">Age :</label>
		<input type="number" id="employeeAge" name="employeeAge" min="20" max="80">
        <br /><br />
        
        <input type="submit" value="Submit" />

    </form>

	<br />
	<a href=${pageContext.request.contextPath}>Back to main menu</a>

</body>
</html>