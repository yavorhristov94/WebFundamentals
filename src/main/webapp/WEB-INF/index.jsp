
<!DOCTYPE html>
<html>
<%@include file="_header.jsp"%>
<!-- reference to a seperately fragmented part for the html-->

<body>
                <% User user = (User)request.getAttribute("user");
                    if(user == null){
                    user = new User();} %> <!-- if no user, just make an empty one -->


        <h2> Welcome <%= user.getName() %></h2>
    <form action="home" method="post">
    <p>
    Name: <input type="text" name="name"/>
    </p>

    <p>
        <input type="submit" value="Enter name">
    </p>
    </form>
</body>
</html>