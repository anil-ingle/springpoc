<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<form:form method="post" commandName="regCmd">
   <p style="color:red">
   <form:errors path="*"/>
   </p>
  no : <form:input path="sno"/> <br>
  name : <form:input path="sname"/><br>
  DOB  : <form:input path="dob"/>(dd-MM-yyyy) <br>
  DOJ  : <form:input path="doj"/>(dd-MM-yyyy) <br>
  DOM  : <form:input path="dom"/>(dd-MM-yyyy) <br>
   <input type="submit" value="register"/>
</form:form>
