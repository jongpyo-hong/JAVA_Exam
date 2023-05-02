<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="age" value="25" />
<c:choose>
    <c:when test="${age < 8}">
        유치원생
    </c:when>
    <c:when test="${age < 14}">
        초등학생
    </c:when>
    <c:when test="${age < 17}">
        중학생
    </c:when>
    <c:when test="${age < 20}">
        고등학생
    </c:when>
    <c:otherwise>
        성인
    </c:otherwise>
</c:choose>