<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/3
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="user/saveStu" method="post">
    姓名：<input name="stuname" type="text">
    年龄:<input name="stuage" type="text">
    编号:<input name="stuid" type="text">
         <input type="submit">


</form>
<form action="/user/find" method="post">
    id:<input type="text" name="id"><br>
    <input type="submit" value="查询"><br>
<a href="user/countStu" methods="get">查询员工总数</a>

</form>
</body>
</html>
