<%--
  Created by IntelliJ IDEA.
  User: java
  Date: 08.06.2018
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2> JSP build</h2>
Request user agent: <%= request.getHeader("User-Agent") %>

<br/><br/>

Request language : <%= request.getLocale()%>
</body>
</html>
