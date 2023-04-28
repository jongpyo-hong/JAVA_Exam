<%@ page contentType="text/html; charset=utf-8" %>
<%@ import="java.net.*" %>;

<%
    String key1 = URLEncoder.encode("값1", "UTF-8");
    String key2 = URLEncoder.encode("값2", "UTF-8");
%>

<h1>ex03.jsp - 전</h1>

<jsp:include page="include.jsp">
    <jsp:param name="key1" value="<%=key1%>" />
    <jsp:param name="key2" value="<%=key2%>" />
</jsp:include>

<h1>ex03.jsp - 후</h1>
