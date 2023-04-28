<%@ page contentType="text/html; charset=utf-8" %>

<jsp:useBean id="user" class="models.users.User" />
<%
    // id="user" -> 지역변수 형태로 User user = new User() 생성
    System.out.println(user);
    user.setUserId("user01");
%>
${user.userId} <%-- user.getUserId()와 동일 --%>

<jsp:useBean id="date" class="java.util.Date" />
<%
    // Date date = new Date();
    System.out.println(date);
    int month = date.getMonth();
    System.out.println(month);
%>
${date.month} <%-- Date.getMonth()와 동일하다 --%>