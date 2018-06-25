<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<h1 style="color:aqua;text-align:center">Registration Form</h1>

<form:form method="post" commandName="stCmd">
   
  Student number :: <form:input path="sno"/><br>
  Student name  :: <form:input path="sname"/><br>
  student address :: <form:input path="sadd"/><br>
  <input type="submit"  value="register">
</form:form>

<br><br>
  ${resultMsg}
