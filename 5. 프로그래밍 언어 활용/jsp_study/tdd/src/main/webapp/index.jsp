<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>
<layout:main pageTitle="메인페이지">
    <c:if test="${member == null}"> <!-- 미 로그인 상태 -->
        <a href="<c:url value='/member/login' />">로그인</a>
        <a href="<c:url value='/member/join' />">회원가입</a>
    </c:if>
    <c:if test="${member != null}"> <!-- 로그인 상태 -->
        ${member.userNm}(${member.userId})님 로그인
        <a href="<c:url value='/member/logout' />">로그아웃</a>
    </c:if>
</layout:main>