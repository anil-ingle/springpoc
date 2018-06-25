<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>

<h1 style='color:maroon;text-align:center'>Naukri.com Registration-Page1</h1>

<form:form  method="POST" commandName="regCmd">
  name:: <form:input path="name"/><br>
  Address ::<form:input path="addrs"/><br>
  Age :: <form:input path="age"/><br>
  <input type="submit" name="_target1" value="next"> 
  <input type="submit" name="_cancel" value="cancel">

</form:form>
