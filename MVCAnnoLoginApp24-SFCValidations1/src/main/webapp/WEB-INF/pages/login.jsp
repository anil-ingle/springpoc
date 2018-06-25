<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h1 style="color:red;text-align:center">Login Page</h1>

<form:form method="POST"  commandName="userCmd">
  <p style="color:red">
   <form:errors path="*"/>
  </p>
   User Name ::: <form:input path="user"/><br>
   Password ::: <form:input path="pwd"/><br>
   age ::: <form:input path="age"/>
  <input type="submit" value="login"/>
</form:form>

<h1> ${result} </h1> 