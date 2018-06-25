<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
  <c:when test="${empList ne null}">
    <h1 style="text-align:center">Employee Details</h1>
    <table border="1">
    <tr><th>empno</th><th>empname</th><th>job</th><th>sal</th>
    
    <c:forEach var="dto" items="${empList}">
       <tr>
         <td>${dto.eno}</td>
         <td>${dto.ename}</td>
        <td>${dto.job}</td>
        <td>${dto.salary}</td> 
       </tr>
    </c:forEach>
   </table>
  </c:when>
  <c:otherwise>
      <h1>No Data found</h1>
  </c:otherwise>
</c:choose>
<br>
 <a href="home.htm">home</a>
