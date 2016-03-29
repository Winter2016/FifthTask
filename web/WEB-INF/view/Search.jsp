<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search</title>
</head>
<body>
<div align="center">
    <h2>Search Information</h2>
    <form action="search" method="post">
        <table>
            <tr>
                <td>Seller:</td>
                <td><input type = "text" name="seller" /></td>
            </tr>
            <tr>
                <td>Buyer:</td>
                <td><input type = "text" name="buyer" /></td>
            </tr>
            <tr>
                <td>Book:</td>
                <td><input type = "text" name="book" /></td>
            </tr>

            <tr>
                <td colspan="2" align="center"> <input type="submit" value="Search"/></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
