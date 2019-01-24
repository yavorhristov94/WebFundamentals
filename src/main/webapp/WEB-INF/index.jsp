<!-- Directives -->
<%@ page import="java.util.Calendar" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="dst" %>
<!-- A tag library being specified to the jsp -->



<!DOCTYPE html>
<html>

<!-- reference to a seperately fragmented part for the html-->
<%@include file="_header.jsp"%>

<!-- OR via import tag -->
<c:import url="_header.jsp" var="_header"/>
${_header}
${_header}
${_header}

<body>
<st:helloworld name=${user.name}></st:helloworld>

                <% User user = (User)request.getAttribute("user");
                    if(user == null){
                    user = new User();} %> <!-- if no user, just make an empty one -->

<!-- in the If tag, in its expression - if the name is not empty-->
    <c:if test="${!empty user.name}">
        <h2> Welcome <%= user.getName() %></h2>
        <h2> Welcome ${ user.name } </h2>
    </c:if>

        <c:if test="${empty user.name}">
            <h2> Welcome, whoever you are</h2>
        </c:if>


    <c:choose>
        <c:when test="${empty user.name}">
            <h2> Welcome, whoever you are</h2>
        </c:when>
        <c:otherwise if test="${!empty user.name}">
                <h2> Welcome <%= user.getName() %></h2>
                <h2> Welcome ${ user.name } </h2>
        </c:otherwise>
    </c:choose>


    <form action="home" method="post">
    <p>
    Name: <input type="text" name="name"/>
    </p>

    <p>
        <input type="submit" value="Enter name">
    </p>
    </form>


        <c:out value="Hello World"/> <!-- using the tag lib marked as prefix C -->
</body>
</html>