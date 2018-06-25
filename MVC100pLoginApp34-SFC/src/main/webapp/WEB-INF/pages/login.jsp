<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form method="post" commandName="userCmd">
  Username ::: <form:input path="user"/><br>
  Password ::: <form:input path="pwd"/><br>
  <input type="submit" value="login">
</form:form>

 <h1>${result} </h1>
