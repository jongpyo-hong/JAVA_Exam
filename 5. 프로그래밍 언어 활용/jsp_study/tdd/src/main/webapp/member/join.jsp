<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>

<c:url var="action" value="/member/join" />

<layout:main pageTitle="회원가입">
    <form method="post" action="${action}" target="ifrmProcess">
        <dl>
            <dt>아이디</dt>
            <dd>
                <input type="text" name="userId">
            </dd>
        </dl>
        <dl>
            <dt>비밀번호</dt>
            <dd>
                <input type="password" name="userPw">
            </dd>
        </dl>
        <dl>
            <dt>비밀번호확인</dt>
            <dd>
                <input type="password" name="userPwRe">
            </dd>
        </dl>
        <dl>
            <dt>회원명</dt>
            <dd>
                <input type="text" name="userNm">
            </dd>
        </dl>
        <button type="submit">가입하기</button>
    </form>
</layout:main>