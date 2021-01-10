<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>

<body>


<h2>Employee form</h2>
<hr>
<br>

    <form:form action="processForm" modelAttribute="employee">

        Name: <form:input path="name" />

        <br/><br/>
        <input type="submit" value="Submit" />

    </form:form>


</body>
</html>