<%@ page contentType="text/html; charset=utf-8" %>
<%
    pageContext.setAttribute("num", 10);
    pageContext.setAttribute("num2", "");
%>
${num > 20 ? "20보다 크다" : "20보다 작다"} <br>
${empty num}<br>
${empty num2}