<%@ page contentType="text/html; charset=utf-8" %>
<%-- ?num1=100&num2=200 --%>
<%--
${param.num1 + param.num2}
--%>
<%
    request.setCharacterEncoding("UTF-8");
%>


선택한 과일 : ${paramValues.fruit[0]}, ${paramValues.fruit[1]},
            ${paramValues.fruit[2]}, ${paramValues.fruit[3]}<br>

Referer : ${header.Referer}<br>

cookie : ${cookie.JSESSIONID.value}