<%@ page contentType="text/html; charset=utf-8" %>
<%
    Cookie cookie = new Cookie("key1", "value1");
    cookie.setPath(request.getContextPath()); // 쿠키 경로설정
    cookie.setHttpOnly(true); // 서버만 조회가능
    cookie.setMaxAge(60 * 60 * 24 * 365); // 단위가 초단위(second)
    response.addCookie(cookie); // 브라우저가 응답헤더에 추가한다, SetCookie 와 다르다

%>