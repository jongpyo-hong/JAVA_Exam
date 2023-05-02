<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forTokens var="item" items="사과, 배# 오렌지, 감_ 멜론" delims=",#_">
    ${item}<br>
</c:forTokens>