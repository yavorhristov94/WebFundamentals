<%@page isErrorPage="true" %>
<html>
<%@include file="_header.jsp"%>
<body>
<h2>Error Page</h2>
<%= exception.getMessage() %>
</body>
</html>