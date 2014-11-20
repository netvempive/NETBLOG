<%--
  Created by IntelliJ IDEA.
  User: netvempive
  Date: 2014/11/14
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title></title>

</head>
<body>
${message}
<form action="welcome.html" method="post">
<input type="hidden" name="_method" value="put">
    <input type="text" name="userName">
    <input type="submit">
</form>

</body>
</html>
