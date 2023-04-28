<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.net.*" %>;
<h1>include.jsp</h1>

<%
    request.setCharacterEncoding("UTF-8");

    String key1 = request.getParameter("key1");
    String key2 = request.getParameter("key2");
    key1 = URLDecoder.decode(key1, "UTF-8");
    key2 = URLDecoder.decode(key2, "UTF-8");

    out.write("key1" + key1 + "<br>");
    out.write("key2" + key2 + "<br>");
%>