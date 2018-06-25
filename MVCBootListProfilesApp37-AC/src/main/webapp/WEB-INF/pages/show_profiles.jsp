<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
  <c:when test="${!empty listProfiles}">
     <h1 style="color:red">Profile Details </h1>
     <table  border="1" width="100%" height="100%" >
       <tr><th>profile_id</th><th>profile_name</th><th>email</th><th>followers</th><th>friends</th></tr>
       <c:forEach var="dto" items="${listProfiles}">
          <tr>
            <td>${dto.profiledId}</td>
            <td>${dto.profileName}</td>
            <td>${dto.email}</td>
            <td>${dto.followers}</td>
            <td>${dto.friends}</td>
          </tr>
       </c:forEach>
     </table>
  </c:when>
  <c:otherwise>
     <h1 style="color:red"><b> No records found</b></h1>
  </c:otherwise>
</c:choose>
<a href="home.htm">home</a>