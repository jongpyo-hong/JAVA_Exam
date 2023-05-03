<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    Date date = new Date();
    pageContext.setAttribute("date", date);
%>

<h3>대한민국/서울</h3>
<fmt:setTimeZone value="Asia/Seoul" />
    <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" />

<h3>필리핀/마닐라</h3>
<fmt:setTimeZone value="Asia/Manila" />
    <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" />

<h3>미국/뉴욕</h3>
<fmt:setTimeZone value="America/New_York" />
    <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" />
