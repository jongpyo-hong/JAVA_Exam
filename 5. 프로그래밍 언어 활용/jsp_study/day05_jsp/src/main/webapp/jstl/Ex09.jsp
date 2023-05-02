<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:catch var="e">
<%
    String str = null;
    str.toUpperCase();
%>
</c:catch>
<c:if test="${e != null}">
    <%-- ${e.getMessage()} --%>
    ${e.message}
</c:if>