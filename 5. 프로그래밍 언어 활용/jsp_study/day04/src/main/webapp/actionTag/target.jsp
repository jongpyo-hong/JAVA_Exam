<%@ page contentType="text/html; charset=utf-8" %>
<h1>target.jsp</h1>

<%
    request.setCharacterEncoding("UTF-8");

    String param1 = request.getParameter("param1");
    String param2 = request.getParameter("param2");
    out.write("param1" + param1 + "<br>");
    out.write("param2" + param2  + "<br>");
    //System.out.printf("param1=%s, param2=%s%n", param1, param2);
%>