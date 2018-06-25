<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
  <c:when test="${!empty empList}">
    <table border="1">
       <tr><th>empno</th><th>ename</th><th>job</th><th>salary</th><th>deptno</th><th>mgrno</th></tr>
       <c:forEach var="dto" items="${empList}">
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
   <h1 style="color:red;text-align:center">Records not found</h1>
  </c:otherwise>
</c:choose>
  <br><a href="home.htm">home</a>
    