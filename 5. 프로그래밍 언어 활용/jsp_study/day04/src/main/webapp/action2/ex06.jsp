<%@ page contentType="text/html; charset=utf-8" %>
<%
    pageContext.setAttribute("name", "이름");
    //String name = (String)pageContext.getAttribute("name"); // 반환값은 Object
    //out.write(name);

    pageContext.removeAttribute("name");
%>
${name}