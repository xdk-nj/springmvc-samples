<%--
  Created by IntelliJ IDEA.
  User: 徐度康
  Date: 2020/11/19
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/date" method="post">
    <table>
        <tr>
            <td>时间：</td>
            <td><input type="text" name="date"></td>
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
