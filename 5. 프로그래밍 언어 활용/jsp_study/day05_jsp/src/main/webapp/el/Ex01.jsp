<%@ page contentType="text/html; charset=utf-8" %>
<%--${10 + 100} --%>
<%
    pageContext.setAttribute("num", 100);
    request.setAttribute("num", 200);
    application.setAttribute("num", 300);
%>
pageContext : ${pageScope.num}<br>
request : ${requestScope.num}<br>
application : ${applicationScope.num}<br>