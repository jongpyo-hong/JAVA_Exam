<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="num" value="100" scope="page"/>
<c:set var="num" value="200" scope="request" />
<c:set var="num" value="300" scope="application" />
<c:remove var="num" scope="request" />

page : ${pageScope.num}<br>
request : ${requestScope.num}<br>
application : ${applicationScope.num}<br>