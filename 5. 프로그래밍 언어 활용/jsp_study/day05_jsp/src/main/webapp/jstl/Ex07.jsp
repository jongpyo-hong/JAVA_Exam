<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<ul>
<c:forEach var="item" items="${items}" varStatus="status">
    <li>
        ${status.index} / ${status.count} /
        first : ${status.first} / last : ${status.last} /
        ${item.subject} / ${item.poster}
    </li>
    <li>
        ${status.current.subject} / ${status.current.poster}
    </li>
</c:forEach>
</ul>