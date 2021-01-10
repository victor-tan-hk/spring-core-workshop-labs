<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>

<body>

<h1> Employee Details </h1>
<hr>
Employee name : ${employee.name}
<br>
Employee background : ${employee.background}
<br>
Country of origin : ${employee.country}
<br>
Residency status : ${employee.status}
<br>
Framework competency:
<ul>
    <c:forEach var="ability" items="${employee.frameworkAbilities}">
        <li> ${ability} </li>
    </c:forEach>
</ul>


</body>
</html>