<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags" %>
<c:set var="num" value="100" />
<util:box color="red">
안녕하세요<br>
반갑습니다 ${num}
</util:box>