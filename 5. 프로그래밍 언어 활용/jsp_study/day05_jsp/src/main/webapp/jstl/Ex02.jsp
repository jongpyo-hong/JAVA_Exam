<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="num" value="100" scope="application" />
page : ${pageScope.num}<br>
request : ${requestScope.num}<br>
application : ${applicationScope.num}<br>