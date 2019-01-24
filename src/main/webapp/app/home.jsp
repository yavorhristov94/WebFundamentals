<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<h2>Goodbye</h2>
<a href="/signin.jsp">Sign In</a> <!-- Relative to root url myapp.com/signin.jsp -->
<a href="signin.jsp">Sign In</a>
<!-- Relative to current url myapp.com/something/somepage/app/app/signin.jsp -->

<a href='<c:url value="/signin.jsp"/>'>Sign In</a>
<!-- Relative to root of app -/app/home.jsp  thus the BEST way to do shit-->
