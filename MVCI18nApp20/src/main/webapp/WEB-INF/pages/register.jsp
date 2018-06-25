<%@ page language="java" contentType="text/html; charset=UTF-8"%>
    
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<a href="home.htm">english</a> &nbsp;
 <a href="home.htm?language=fr_FR">french</a> &nbsp;
 <a href="home.htm?language=de_DE">german</a> &nbsp;
 <a href="home.htm?language=zh_CN">chinees</a> &nbsp;

<form action="login.htm" method="post">
  <spring:message code="form.uname" text="provide username"/><input type="text" name="uname"><br>
  <spring:message code="form.pwd" text="provide password"/><input type="text" name="pwd"><br>
  <input type="submit"  value="<spring:message code="form.button"/>"/>
</form>