<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<form:form method="post" commandName="regCmd">

  name : <form:input path="name"/> <form:errors path="name"/><br>
  addrs : <form:input path="addrs"/><form:errors path="addrs"/><br>
  Country: <form:select path="country">
            <form:options items="${countriesList}"/>
          </form:select> <form:errors path="country"/><br>
  Courses: <form:select path="courses" multiple="true">
            <form:options items="${coursesList}"/>
           </form:select><form:errors path="courses"/> <br>
   hobies: <form:checkboxes items="${hobiesList}" path="hobies"/> <br> 
   
   <input type="submit" value="register"/>
</form:form>
