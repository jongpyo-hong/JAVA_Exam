<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:formatNumber value="100000000000000000" groupingUsed="false"/><br>

<fmt:formatNumber value="1000000000.12" pattern="0,000.000000" /><br>
<fmt:formatNumber value="1000000000.12" pattern="'#'#,##.######" /><br>

<fmt:setLocale value="ja_jp" />
<fmt:formatNumber value="20000" type="currency" /><br>
<fmt:formatNumber value="0.25" type="percent" />
