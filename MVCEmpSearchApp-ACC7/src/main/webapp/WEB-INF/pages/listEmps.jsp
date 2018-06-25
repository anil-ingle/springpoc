<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
  <c:when test="${searchList ne null}">
    <h1 style="color:red;text-align:center">Search Results </h1>
    <table border="1">
      <tr><th>Empno</th><th>Empname</th><th>EmpJob</th><th>EmpSalary</th><th>Dept no</th><th>Manager no</th></tr>
      <c:forEach var="dto" items="${searchList}">
        <tr>
          <td>${dto.eno}</td>
          <td>${dto.ename}</td>
          <td>${dto.job}</td>
          <td>${dto.salary}</td>
          <td>${dto.deptno}</td>
          <td>${dto.mgrNo}</td>
        </tr>
      </c:forEach>
    </table>    
  </c:when>
  <c:otherwise>
    <p style='color:red'>Records not found...</p>
  </c:otherwise>
</c:choose>

<br>
<a href='home.htm'>home</a>
