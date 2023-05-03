<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    Date date = new Date();
%>
<c:set var="date" value="<%=date%>" />

<fmt:formatDate value="${date}" type="date" /><br>
<fmt:formatDate value="${date}" type="time" /><br>
<fmt:formatDate value="${date}" type="both" /><br>

<fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full"/><br>
<fmt:formatDate value="${date}" type="both" dateStyle="long" timeStyle="long"/><br>
<fmt:formatDate value="${date}" type="both" dateStyle="medium" timeStyle="medium"/><br>
<fmt:formatDate value="${date}" type="both" dateStyle="short" timeStyle="short"/><br>

<fmt:formatDate value="${date}" type="both" pattern="yy/MM/dd HH:mm (E) "/><br>
