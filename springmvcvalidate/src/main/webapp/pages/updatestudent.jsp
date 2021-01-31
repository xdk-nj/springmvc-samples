<%--
  Created by IntelliJ IDEA.
  User: 徐度康
  Date: 2020/11/19
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/updateStu" method="post">
    <table>
        <tr>
            <td>编号：</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>作者：</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>邮箱：</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="更新">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
