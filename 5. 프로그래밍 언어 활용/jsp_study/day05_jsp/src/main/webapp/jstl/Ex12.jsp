<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String contextPath = request.getContextPath();
    //out.write(contextPath);
%>
<c:url var="url1" value="/jstl/Ex11.jsp">
    <c:param name="key1" value="value1" />
    <c:param name="key2" value="value2" />
</c:url>
<a href="<%=contextPath%>/jstl/Ex11.jsp">이동</a>
<a href="${url1}">이동</a>
