<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="num" value="10" />
<c:if test="${num > 5}">
    ${num}은 5보다 크다.
</c:if>
<c:if test="${num <= 5}">
    ${num}은 5보다 작거나 같다.
</c:if>
<br>
${num}는 ${num > 5 ? "5보다 크다." : "5보다 작거나 같다"}