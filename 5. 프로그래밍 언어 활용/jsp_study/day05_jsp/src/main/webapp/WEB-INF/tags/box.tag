<%@ tag body-content="tagdependent" %>
<%@ tag pageEncoding="UTF-8" %>
<%@ tag trimDirectiveWhitespaces="true" %>
<%@ attribute name="color" %>
<div style="border: 1px dashed ${color}; padding: 20px;">
    <jsp:doBody />
</div>