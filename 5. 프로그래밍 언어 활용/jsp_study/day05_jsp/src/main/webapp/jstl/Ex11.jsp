<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>Ex11.jsp - 상단</h1>

<%--
<c:import url="Ex09.jsp" />
--%>

<c:import var="html" url="https://m.naver.com" /> <%-- 외부자원 --%>
${html}

<h1>Ex11.jsp - 하단</h1>
