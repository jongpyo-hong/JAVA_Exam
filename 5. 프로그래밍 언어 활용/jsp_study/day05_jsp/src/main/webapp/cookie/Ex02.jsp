<%@ page contentType="text/html; charset=utf-8" %>
<%
    Cookie[] cookies = request.getCookies();
    for (Cookie cookie : cookies) {
        String name = cookie.getName();
        String value = cookie.getValue();
        out.write("name=" + name + ", value=" + value + "<br>");

        if (name.equals("key1")) {
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }
    }


%>