<%--
  Created by IntelliJ IDEA.
  User: 徐度康
  Date: 2020/11/19
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/list" method="post">
    <table>
        <tr>
            <td>书名：</td>
            <td><input type="text" name="books[0].name"></td>
        </tr>
        <tr>
            <td>作者：</td>
            <td><input type="text" name="books[0].author"></td>
        </tr>
        <tr>
            <td>价格：</td>
            <td><input type="text" name="books[0].price"></td>
        </tr>
        <tr>
            <td>是否上架：</td>
            <td>
                <input type="radio" value="true" name="books[0].isPublic">是
                <input type="radio" value="false" name="books[0].isPublic">否
            </td>
        </tr>



        <tr>
            <td>书名：</td>
            <td><input type="text" name="books[1].name"></td>
        </tr>
        <tr>
            <td>作者：</td>
            <td><input type="text" name="books[1].author"></td>
        </tr>
        <tr>
            <td>价格：</td>
            <td><input type="text" name="books[1].price"></td>
        </tr>
        <tr>
            <td>是否上架：</td>
            <td>
                <input type="radio" value="true" name="books[1].isPublic">是
                <input type="radio" value="false" name="books[1].isPublic">否
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
