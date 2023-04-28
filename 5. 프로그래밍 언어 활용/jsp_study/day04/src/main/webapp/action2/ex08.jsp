<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="models.users.*" %>
<jsp:useBean id="user" class="models.users.User" scope="page" />
<%
    User user2 = (User)pageContext.getAttribute("user");
    //User user2 = (User)request.getAttribute("user");
    //User user2 = (User)application.getAttribute("user");
    //System.out.println(user2);
    user.setUserId("user01");
    user.getUserId();
%>
${user.userId} <%-- user.getUserId() --%>