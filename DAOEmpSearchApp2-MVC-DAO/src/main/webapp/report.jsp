<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<c:choose>
  <c:when test="${searchResults ne null }">
    <table border="1">
      <tr><th>empno</th><th>ename</th><th>JOB</th><th>Salary</th></tr>
      <c:forEach var="map" items="${searchResults}">
       <tr>
         <td>${map.EMPNO}</td>
         <td>${map.ENAME}</td>
         <td>${map.JOB}</td>
         <td>${map.SAL}</td>
       </tr>
      </c:forEach>
    </table>
  </c:when>
  <c:otherwise>
      Records not found
  </c:otherwise>
</c:choose>
<br><br><br>
<a href="search.html">home</a>