<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*" %>
<%
    Map<String, String> data = new HashMap<>();
    data.put("max-num", "100");

    request.setAttribute("data", data);
%>

${data["max-num"]}
