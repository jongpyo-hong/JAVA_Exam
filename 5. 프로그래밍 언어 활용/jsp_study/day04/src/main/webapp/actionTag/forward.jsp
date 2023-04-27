<%@ page contentType="text/html; charset=utf-8" %>
<h1>forward.jsp</h1>
<jsp:forward page="target.jsp">
    <jsp:param name="param1" value="요청값1" />
    <jsp:param name="param2" value="요청값2" />
</jsp:forward>