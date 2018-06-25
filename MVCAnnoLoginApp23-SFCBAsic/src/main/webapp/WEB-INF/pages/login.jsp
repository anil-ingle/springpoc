<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h1 style="color:red;text-align:center">Login Page</h1>

<form:form method="POST"  commandName="userCmd">
   User Name ::: <form:input path="user"/><br>
   Password ::: <form:input path="pwd"/><br>
  <input type="submit" value="login"/>
</form:form>

<h1> ${result} </h1> 