<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<h1 style="color:aqua;text-align:center">Registration Form</h1>

<form:form method="post" commandName="stCmd">
<%-- <p style='color:red'>
  <form:errors path="*"/>
</p>
<br> --%>
  Student number :: <form:input path="sno"/><form:errors path="sno"/><br>
  Student name  :: <form:input path="sname"/><form:errors path="sname"/><br>
  student address :: <form:input path="sadd"/><form:errors path="sadd"/><br>
  <input type="submit"  value="register">
</form:form>

