<%@ page  isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<c:choose>
  <c:when test="${!empty speakingLangs}">
     <c:forEach var="lang" items="${speakingLangs}">
        <b>${lang}</b> <br>
     </c:forEach>
  </c:when>
  <c:otherwise>
    <b>No data found</b>
  </c:otherwise>
 </c:choose>
 <br>
 <a href="home.htm">home</a>

 
