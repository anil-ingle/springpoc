<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>

<h1 style='color:maroon;text-align:center'>Naukri.com Registration-Page2</h1>

<form:form  method="POST" commandName="regCmd">
  Experience:: <form:input path="exp"/><br>
  skillDomain ::<form:input path="skillDomain"/><br>
  <input type="submit" name="_target0" value="previous">
  <input type="submit" name="_target2" value="next"> 
  <input type="submit" name="_cancel" value="cancel">

</form:form>
