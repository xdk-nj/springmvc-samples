<%--
  Created by IntelliJ IDEA.
  User: 徐度康
  Date: 2020/11/19
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/map" method="post">
    <table>
        <tr>
            <td>书名：</td>
            <td><input type="text" name="map['name']"></td>
        </tr>
        <tr>
            <td>作者：</td>
            <td><input type="text" name="map['author']"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="添加">
            </td>
        </tr>

    </table>
</form>
</body>
</html>
