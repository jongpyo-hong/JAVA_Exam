<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    Date date = new Date();
    pageContext.setAttribute("date", date);
%>


<h3>대한민국</h3>
<fmt:setLocale value="ko" />
<fmt:formatDate value="${date}" />

<h3>중국</h3>
<fmt:setLocale value="zh" />
<fmt:formatDate value="${date}" />

<h3>일본</h3>
<fmt:setLocale value="ja" />
<fmt:formatDate value="${date}" />
