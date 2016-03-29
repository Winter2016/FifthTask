<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>
<div align="center">
    <h2>Delete Information</h2>
    <form action="delete" method="post">
        <table>
            <tr>
                <td>ID to delete:</td>
                <td><input type = "number" name="id" /></td>
            </tr>

            <tr>
                <td colspan="2" align="center"> <input type="submit" value="Delete"/></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
