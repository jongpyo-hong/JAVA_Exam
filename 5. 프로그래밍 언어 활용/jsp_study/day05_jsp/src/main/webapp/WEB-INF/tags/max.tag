<%@ tag body-content="empty" pageEncoding="UTF-8" %>
<%@ tag trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="num1" type="java.lang.Integer" %>
<%@ attribute name="num2" type="java.lang.Integer" %>
<%@ variable name-given="maximum" variable-class="java.lang.Integer" scope="AT_END" %>

<%
    int max = num1 > num2 ? num1 : num2;
%>

<c:set var="maximum" value="<%=max%>" />