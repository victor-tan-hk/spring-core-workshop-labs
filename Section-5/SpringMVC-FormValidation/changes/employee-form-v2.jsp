<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>

<head>
    <title>Employee Registration Form</title>
    <style>
        .error {color:red}
    </style>
</head>

<body>


<h2>Employee form</h2>
<hr>
<br>

    <form:form action="processForm" modelAttribute="employee">

        Name: <form:input path="name" />
        <form:errors path="name" cssClass="error" />
        <br/><br/>
        
        Age: <form:input path="age" />
        <form:errors path="age" cssClass="error" />
        
        <br/><br/>
        <input type="submit" value="Submit" />

    </form:form>


</body>
</html>