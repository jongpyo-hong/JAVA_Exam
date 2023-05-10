<%@ page contentType="text/html; charset=utf-8" %>
<%
    String userId = (String)session.getAttribute("userId");
    out.print(userId);
%>