<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>

<h1 style="color:red;text-align:center">Edit Student Details </h1>

<form:form method="POST" commandName="stCmd">
  Number: <form:input path="sno" readonly="true" disabled="true"/> <br>
  name: <form:input path="sname"/><form:errors cssStyle="color:red" path="sname" /> <br>
  Address: <form:input path="sadd"/><form:errors path="sadd"/> <br>
  <input type="Submit"  value="edit"/>
</form:form>
<br>
<a href="listStuds.htm">listStudents</a>

