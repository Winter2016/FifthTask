<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Search Result's</title>
</head>
<body>
<div align="center">
<table border="0">
    <thead>Order Date </thead>
    <thead>Seller </thead>
    <thead>Buyer </thead>
    <thead>Book </thead>
    <thead>Amount </thead>
    <thead>Cost </thead>

    <c:forEach items="${purchases}" var = "purchase">
        <tr>
            <td>${purchase.buy_date}</td>
            <td>${purchase.seller}</td>
            <td>${purchase.buyer}</td>
            <td>${purchase.book}</td>
            <td>${purchase.amount}</td>
            <td>${purchase.cost}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>