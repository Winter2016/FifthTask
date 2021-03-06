<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Registration Success</title>
</head>
<body>
<div align="center">
  <table border="0">
    <tr>
      <td colspan="2" align="center"><h2>Registration Succeeded!</h2></td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <h3>Here's the review of your details:</h3>
      </td>
    </tr>
    <tr>
      <td>Order Date:</td>
      <td>${purchaseForm.buy_date}</td>
    </tr>
    <tr>
      <td>Seller:</td>
      <td>${purchaseForm.seller}</td>
    </tr>
    <tr>
      <td>Buyer:</td>
      <td>${purchaseForm.buyer}</td>
    </tr>
    <tr>
      <td>Book Title:</td>
      <td>${purchaseForm.book}</td>
    </tr>
    <tr>
      <td>Amount:</td>
      <td>${purchaseForm.amount}</td>
    </tr>
    <tr>
      <td>Cost:</td>
      <td>${purchaseForm.cost}</td>
    </tr>

  </table>
</div>
</body>
</html>