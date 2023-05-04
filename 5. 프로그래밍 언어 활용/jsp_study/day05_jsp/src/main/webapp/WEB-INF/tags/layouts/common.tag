<%@ tag body-content="scriptless" pageEncoding="UTF-8" %>
<%@ tag trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="header" fragment="true" %>
<%@ attribute name="footer" fragment="true" %>
<!DOCTYPE html>
<html>
    <head>
        <title>사이트 제목</title>
        <link rel="stylesheet" type="text/css" href="<c:url value='/css/style.css' /> ">
        <c:if test="${addCss != null}">
            <c:forEach var="cssFile" items="${addCss}">
                <link rel="stylesheet" type="type/css" href="<c:url value='/css/' />${cssFile}.css" />
            </c:forEach>
        </c:if>
        <script src="<c:url value='/js/common.js' />"></script>
        <c:if test="${addScript != null}">
            <c:forEach var="jsFile" items="${addScript}">
                <script src="<c:url value='/js/' /> ${jsFile}.js"></script>
            </c:forEach>
        </c:if>
    </head>

    <body>
        <header>
            <jsp:invoke fragment="header" />
        </header>

        <main>
            <jsp:doBody />
        </main>

        <footer>
            <jsp:invoke fragment="footer" />
        </footer>
    </body>
</html>