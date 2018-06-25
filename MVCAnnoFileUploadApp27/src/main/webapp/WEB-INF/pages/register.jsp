<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>

<h1 style="color:red;text-align:center">Upload your  files...</h1>

<form:form method="POST" commandName="regCmd" enctype="multipart/form-data">
   <p style="color:red">
     <form:errors path="*"/>
   </p>
  Select file1:: <input type="file" name="file1"><br>
  Select file2:: <input type="file" name="file2"><br>
  <input type="submit"  value="upload">
</form:form>
