<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    Date date = new Date();
    pageContext.setAttribute("date", date);
%>

<h3>대한민국/서울</h3>
<fmt:timeZone value="Asia/Seoul">
    <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" />
</fmt:timeZone>

<h3>필리핀/마닐라</h3>
<fmt:timeZone value="Asia/Manila">
    <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" />
</fmt:timeZone>

<h3>미국/뉴욕</h3>
<fmt:timeZone value="America/New_york">
    <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" />
</fmt:timeZone>