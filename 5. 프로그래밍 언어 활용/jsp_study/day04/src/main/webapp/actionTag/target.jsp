<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.net.*" %>
<h1>target.jsp</h1>

<%
    request.setCharacterEncoding("UTF-8");

    String param1 = request.getParameter("param1");
    String param2 = request.getParameter("param2");
    param1 = URLDecoder.decode(param1,"UTF-8");
    param2 = URLDecoder.decode(param2,"UTF-8");

    out.write("param1" + param1 + "<br>");
    out.write("param2" + param2  + "<br>");
    System.out.printf("param1=%s, param2=%s%n", param1, param2);
%>