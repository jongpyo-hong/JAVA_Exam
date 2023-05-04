<%@ page contentType="text/html; charset=utf-8" %>
<%
    Cookie cookie = new Cookie("key1", "value1");
    cookie.setPath(request.getContextPath()); // 삭제할 때 경로를 확인 해야한다
    cookie.setMaxAge(0); // 쿠키를 삭제할 때 만료시간을 0으로 설정한다
    response.addCookie(cookie);
%>