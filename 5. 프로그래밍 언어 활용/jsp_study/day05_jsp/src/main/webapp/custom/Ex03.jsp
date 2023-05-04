<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags" %>
<util:max num1="20" num2="100" />
${maximum}

<util:min var="min" num1="30" num2="5" />
${min}