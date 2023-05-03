<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="html" value="<script>alert('실행');</script>" />
<%-- ${html} --%>
<c:out value="${html}" escapeXml="false" />
&lt;
&gt;