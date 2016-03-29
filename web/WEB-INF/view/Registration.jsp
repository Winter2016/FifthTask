<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
</head>
<body>
<div align="center">
<h2>Add Information</h2>
<form:form action="register" method="post" commandName="purchaseForm">
    <table>
        <tr>
            <td>Order date(mm/dd/yyyy):</td>
            <td><form:input path="buy_date" /></td>
        </tr>
        <tr>
            <td>Seller:</td>
            <td><form:input path="seller" /></td>
        </tr>
        <tr>
            <td>Buyer:</td>
            <td><form:input path="buyer" /></td>
        </tr>
        <tr>
            <td>Book Title:</td>
            <td><form:input path="book" /></td>
        </tr>
        <tr>
            <td>Amount:</td>
            <td><form:input path="amount" /></td>
        </tr>
        <tr>
            <td>Cost:</td>
            <td><form:input path="cost" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center"> <input type="submit" value="Add"/></td>
        </tr>
    </table>
</form:form>
</div>
</body>
</html>
