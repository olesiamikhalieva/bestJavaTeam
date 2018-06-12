<%@ page import="com.JDBCPostgreSQLExample" %><%--
  Created by IntelliJ IDEA.
  User: java
  Date: 08.06.2018
  Time: 19:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br/><br/>
<%
    for (String str : JDBCPostgreSQLExample.OUTPUT())
    {
        out.println(str);
    }
%>
</body>
</html>
