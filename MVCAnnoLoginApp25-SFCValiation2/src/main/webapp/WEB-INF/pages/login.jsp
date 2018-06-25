<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h1 style="color:red;text-align:center">Login Page</h1>

<form:form method="POST"  commandName="userCmd">
<p style="color:red">
  <form:errors path="*"/> 
</p>
   User Name ::: <form:input path="user"/><br>
   Password ::: <form:input path="pwd"/><br>
   age ::: <form:input path="age"/> <br>
   Select domains::: <form:checkboxes items="${dmnList}" path="domain"/> <br>
   DOB :: <form:input path="dob"/>(dd-MM-yyyy) <br>
  <input type="submit" value="login"/>
</form:form>

<h1> ${result} </h1> <br>

cmd data :: ${cmdData}
 