<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>

<h1 style='color:maroon;text-align:center'>Naukri.com Registration-Page3</h1>

<form:form  method="POST" commandName="regCmd">
  Expected Salary:: <form:input path="expSalary"/><br>
  PreffredLocation ::<form:input path="location"/><br>
  <input type="submit" name="_target1" value="previous">
  <input type="submit" name="_finish" value="finish"> 
  <input type="submit" name="_cancel" value="cancel">
</form:form>
