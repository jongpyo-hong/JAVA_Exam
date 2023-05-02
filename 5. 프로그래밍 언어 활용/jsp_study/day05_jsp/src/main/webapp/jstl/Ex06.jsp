<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="num" begin="1" end="10" step="2">
    <h1>${num}. 반복</h1>
</c:forEach>