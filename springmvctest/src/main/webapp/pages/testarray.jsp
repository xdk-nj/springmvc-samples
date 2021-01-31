<%--
  Created by IntelliJ IDEA.
  User: 徐度康
  Date: 2020/11/19
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/array" method="post">
    <table>
        <tr>
            <td>兴趣：</td>
            <td>
                <input type="checkbox" name="favs" value="足球">足球
                <input type="checkbox" name="favs" value="蓝球">蓝球
                <input type="checkbox" name="favs" value="黑球">黑球
            </td>
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
