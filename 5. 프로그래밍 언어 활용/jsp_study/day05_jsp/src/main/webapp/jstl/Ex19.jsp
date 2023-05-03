<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="ko" />
<%--<fmt:setBundle basename="messages.commons" /> --%>
<fmt:bundle basename="messages.commons">
    <fmt:message key="userId" /><br>
    <fmt:message key="userPw" /><br>

    <fmt:message key="loginMsg">
        <fmt:param>사용자01</fmt:param>
        <fmt:param>user01</fmt:param>
    </fmt:message>
</fmt:bundle>