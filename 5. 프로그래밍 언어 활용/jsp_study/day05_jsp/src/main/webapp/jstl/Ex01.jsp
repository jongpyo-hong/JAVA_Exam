<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    int num4 = 1000;
%>

<c:set var="num1" value="100" />
<c:set var="num2" value="200" />
<c:set var="num3" value="${num2}" />
<c:set var="num4" value="<%=num4%>" />
${num1+num2}<br>
${num3}<br>
${num4}